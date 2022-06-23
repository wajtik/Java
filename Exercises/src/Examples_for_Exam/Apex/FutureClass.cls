public class AccountProcessor {
  @future
  public static void countContacts(List<Id> Ids) {
    List<Account> accList = [
      SELECT Id, Number_Of_Contacts__c, (SELECT Id FROM Contacts)
      FROM Account
      WHERE Id IN :Ids
    ];
    for (Account a : accList) {
      List<Contact> conList = a.Contacts;
      a.Number_Of_Contacts__c = conList.size();
    }
    update accList;
  }
}
