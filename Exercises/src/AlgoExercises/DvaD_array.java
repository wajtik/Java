package AlgoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DvaD_array {

    public static int hourglassSum(List<List<Integer>> arr) {
        
        int sum = 0;
        List<Integer> s = new ArrayList<Integer>() {
            
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1)
                     + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                s.add(sum);
            }
        }

        Collections.sort(s, Collections.reverseOrder());
        return s.get(0);
    }  
    
    public static void main(String[] args) {
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        myList.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        myList.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        myList.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        myList.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        myList.add(Arrays.asList(0, 0, 1, 2, 4, 0));

        System.out.println(hourglassSum(myList));

               }
}