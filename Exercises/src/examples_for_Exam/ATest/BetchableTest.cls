@isTest
private class LeadprocessorTest {
    @isTest
    public static void testit() {
        List<Lead> leads = new List<Lead>();
       
        // insert 200 leads
        for (Integer i=0;i<200;i++) {
            Lead l = new Lead();
            l.LastName = 'name' + i;
            l.Company = 'Company' + i;
            l.Status = 'Random';
            l.LeadSource = 'Dreamforce';
            leads.add(l);
        }
        insert leads;
    
        test.startTest();
        LeadProcessor ls = new LeadProcessor();
        Id batchId = Database.executeBatch(ls);
        Test.stopTest();
        
        System.assertEquals(200, [select count() FROM lead WHERE LeadSource = 'Dreamforce']);
    }
}