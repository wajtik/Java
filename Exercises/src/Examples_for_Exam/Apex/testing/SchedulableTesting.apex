@IsTest
public class SchedulableTesting{
 
 @testSetup
    static void setup(){
    List<Lead> leadList = new List<Lead>();

        for (Integer i = 0; i < 200; i++) {
            Lead l = new Lead();
            l.LastName = 'Test';
            l.Company = 'Random';
            l.Status = 'Open - Not Contacted';
            leadList.add(l);
        }
        INSERT leadList;
     }	
        
    static testmethod void testDailyLeadProcessorScheduledJob() {
        String sch = '0 5 12 * * ?';
        Test.startTest();
         // Schedule the test job
        String jobId = System.schedule('ScheduledApexTest', sch, new DailyLeadProcessor());
        
        List<Lead> listOfLead = [SELECT Id FROM Lead WHERE LeadSource = null LIMIT 200];
        System.assertEquals(200, listOfLead.size());
        Test.stopTest();
    }
}