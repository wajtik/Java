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

/*
System.Schedule Method
RemindOpptyOwners reminder = new RemindOpptyOwners();
// Seconds Minutes Hours Day_of_month Month Day_of_week optional_year
String sch = '20 30 8 10 2 ?';
String jobID = System.schedule('Remind Opp Owners', sch, reminder);
*/
