trigger TriggerOpportunity on Opportunity (before insert, before update){
    if(Trigger.isBefore) {
        if(Trigger.isInsert && Trigger.isUpdate){
            for(Opportunity opp:trigger.new){
                if(opp.Amount < 5000){
                    opp.Amount.adderror('Amount cannot be less than 5000.');
                }
            }
        }
    }
}