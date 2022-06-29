@IsTest
public class AccountProcessorTest {
    public static testMethod void TestAccountProcessorTest() {
        Account a = new Account();
        a.Name = 'Test';
        Insert a;
        
        Contact con = new Contact();
        con.FirstName = 'Rado';
        con.LastName = 'Biely';
        con.AccountId = a.Id;
        Insert con;
        
        List<Id> listAccId = new List<Id>();
        setAccId.add(a.Id);
        
        Test.StartTest();
        AccountProcessor.CountContacts(listAccId);
        Test.StopTest();
        
        Account Acc = [SELECT Number_Of_Contacts__c FROM Account WHERE Id = :a.Id ];
        System.assertEquals(Integer.valueOf(Acc.Number_Of_Contacts__c), 1);
    }
}