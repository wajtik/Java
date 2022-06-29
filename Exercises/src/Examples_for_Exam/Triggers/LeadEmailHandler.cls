public with sharing class LeadEmailHandler {
    public static void sendEmail(List<Lead> leads) {

        Messaging.SingleEmailMessage message = new Messaging.SingleEmailMessage();
   
        for(Lead l : leads){
            if(l.Interest_Type__c == 'Question' && l.Email != null) {
            
            EmailTemplate emailTemplate =[SELECT Id,Subject,Description, HtmlValue,DeveloperName,Body
                                          FROM EmailTemplate 
                                          WHERE name ='ThankYouEmail'];

            message.setSaveAsActivity(false);
            message.setTemplateID(emailTemplate.Id);
            message.setWhatId(l.Id); 
            message.setTargetObjectId(l.Id);
            message.toAddresses = new String[] {l.email};
            Messaging.SingleEmailMessage[] messages = new   
            List<Messaging.SingleEmailMessage> {message};
            Messaging.SendEmailResult[] results = Messaging.sendEmail(messages);
            }      
    }

    }
}
