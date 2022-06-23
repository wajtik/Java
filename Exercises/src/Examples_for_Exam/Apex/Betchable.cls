public class LeadProcessor implements Database.Batchable<sObject>, Database.Stateful {
  public Integer count = 0;

  public Database.QueryLocator start(Database.BatchableContext bc) {
    return Database.getQueryLocator('SELECT ID, LeadSource FROM Lead');
  }
  public void execute(Database.BatchableContext bc, List<Lead> leads) {
    // process each batch of records
    List<Lead> leads_new = new List<Lead>();
    for (Lead l : leads) {
      l.LeadSource = 'Dreamforce';
      leads_new.add(l);
      count += 1;
    }
    update leads_new;
  }

  public void finish(Database.BatchableContext bc) {
    system.debug('count= ' + count);
  }
}
