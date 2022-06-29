package Exercises;
import java.util.HashMap;
import java.util.List;

public class HashTablesRansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        
        HashMap<String,Integer> magazineMap = new HashMap<String,Integer>();
        

        ////////// NOT FINISHED -did not passed all tests///////////////
    
        for (int i = 0; i < magazine.size(); i++) {
            Integer wordcount = magazineMap.get(magazine.get(i));
            if(wordcount == null ) {
                magazineMap.put(magazine.get(i), 1);
            } else {
                magazineMap.put(magazine.get(i), wordcount + 1);
            }
        }

        for (int i = 0; i < note.size(); i++) {
            Integer wordcount = magazineMap.get(note.get(i));
            if(wordcount == 0 || wordcount == null) {
                System.out.println("No");
            } else {
                magazineMap.put(note.get(i), wordcount - 1);
                
            }
            
        }
   System.out.println("Yes");
}
}
