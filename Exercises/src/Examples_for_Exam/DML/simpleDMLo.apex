

public class Studend {
    Studend s = new Studend(Name = 'name');
    try{
      INSERT s; 
  
    } catch {
      (DmlException e){
        exeption code;
      }
    } 



Student s = [SELECT Id, Name FROM Student__c WEHRE Name = 'Rado'];
try{
  DELETE s;
} catch {
  (DmlException e) {
    System.debug('The following error has occurred.'); 
  }
}

Student s = new Student(Name = 'Rado');
INSERT s;
Student rado = [SELECT Id, Name FROM Student__c WEHRE id = s.id]
rado.Name = 'Dano';
UPDATE rado;



}


