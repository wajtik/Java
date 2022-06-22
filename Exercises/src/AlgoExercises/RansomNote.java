package AlgoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        int countNot = 0;
            
        for(int i = 0; i < note.size(); i++) {
            if(magazine.contains(note.get(i))){
               magazine.remove(note.get(i));
            } else {
                countNot++;
            }
        }
        if(countNot > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
        
    public static void main(String[] args) {
        List<String> magazine = new ArrayList<>();
        magazine.addAll(Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts"));
        
        List<String> note = new ArrayList<>();
        note.addAll(Arrays.asList("ive", "got", "some", "coconuts"));
           
        checkMagazine(magazine, note);
    }
}

