trigger LeadEmailTrigger on Lead (after insert) {
    if(Trigger.isInsert && Trigger.isAfter) {
        LeadEmailHandler.sendEmail(Trigger.new);
    }
}