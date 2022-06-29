package Exercises;
import java.util.Collections;
import java.util.List;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.

 Example
The minimum sum is  and the maximum sum is . The function prints
 */

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        
     long minN = Collections.min(arr);   
     long maxN = Collections.max(arr);  
     long sumMin = 0;
     long sumMax = 0;

     //min number -max
        for (int i = 0; i < arr.size(); i++) {
           sumMin += arr.get(i);
           sumMax += arr.get(i);
            }    
            sumMin = sumMin - maxN;
            sumMax -= minN;

            System.out.println(sumMin + " " + sumMax);
        } 
        
    }
