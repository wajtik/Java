public class LeadProcessor implements Database.Batchable<sObject>, Database.Stateful {
    
    public Integer count = 0;
    
	 public Database.QueryLocator start(Database.BatchableContext bc) {
        return Database.getQueryLocator(
            'SELECT ID, LeadSource FROM Lead');
   }
    public void execute(Database.BatchableContext bc, List<Lead> scope){
        // process each batch of records
        List<Lead> leads = new List<Lead>();
        		for(Lead l : scope) {
        			l.LeadSource = 'Dreamforce';
                    leads.add(l);
                    count += 1;
				}
        update leads;
    }
    
	public void finish(Database.BatchableContext bc){   
        system.debug('count= ' + count);
     }            
}