public class DailyLeadProcessor implements Schedulable {
  public void execute(SchedulableContext ctx) {
    List<Lead> leadList = [
      SELECT Id, LeadSource
      FROM Lead
      WHERE leadSource = NULL
      LIMIT 200
    ];

    List<Lead> updatedLlist = new List<Lead>();
    for (Lead l : leadList) {
      l.leadSource = 'Dreamforce';
      updatedLlist.add(l);
    }
    update updatedLlist;
  }
}
