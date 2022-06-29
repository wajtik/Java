public class AddPrimaryContact implements Queueable {
    private String state;
    private Contact con;
    
    public AddPrimaryContact(Contact con, String state) {
   		this.state = state;
        this.con = con;
    }
    
    public void execute(QueueableContext context) {
        List<Account> accList = [SELECT Id, Name, (Select id,FirstName,LastName from contacts ) 
                                 FROM Account  
                                 WHERE BillingState = :state 
                                 LIMIT 200];
      
      List<Contact> conList = new List<Contact>();
         for (Account acc:accList)
         {
                 Contact cont = con.clone(false,false,false,false);
                 cont.AccountId =  acc.id;
                 conList.add(cont);
         }
         
         if(conList.size() > 0 )
         {
        INSERT accList;
    }
   }
}