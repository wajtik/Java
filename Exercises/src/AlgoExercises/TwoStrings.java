package AlgoExercises;
import java.util.HashSet;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {      
        HashSet<Character> string1 = new HashSet<>();
        HashSet<Character> string2 = new HashSet<>();
        
        for (int i = 0; i < s1.length(); i++) {
            string1.add(s1.charAt(i));
        }
        
         for (int i = 0; i < s2.length(); i++) {
            string2.add(s2.charAt(i));
        }
        
        string1.retainAll(string2);
        
        if(string1.isEmpty()) {
            return "NO";
        } else {
            return "YES";
        }   
   }

   public static void main(String[] args) {
    String s1 = "aand";
    String s2 = "art";

    System.out.println(twoStrings(s1, s2));   
    }        
}


