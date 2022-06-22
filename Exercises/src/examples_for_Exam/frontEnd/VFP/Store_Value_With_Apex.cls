public with sharing class ContactController {

    public Contact c { get; set; }

    public List<Contact> samepage { get; set; }
    
    public ContactController(){
       c = new Contact();
    }

    public PageReference save() {
       insert c;  
      samepage= [SELECT Id,FirstName,LastName FROM Contact WHERE id=:c.id];
      
        return null;
    }
 }