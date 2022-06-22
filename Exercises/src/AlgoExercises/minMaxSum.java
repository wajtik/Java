package AlgoExercises;

import java.util.Collections;
import java.util.List;

class minMaxSum {
    
    public static void minMaxSuma (List<Integer> arr) {
    long minN = Collections.min(arr);
    long maxN = Collections.max(arr);
    long maxSum = 0;
    long minSum = 0;

    for (int i = 0; i < arr.size(); i++) {
        minSum += arr.get(i);
        maxSum += arr.get(i);
    }

    minSum = minSum - maxN;
    maxSum = maxSum - minN;

    System.out.println(minSum + " " + maxSum);

}

public static void main(String[] args) {
    
    List<Integer> arrr =  List.of(1,2,3,4);  

    minMaxSuma(arrr);
}

}
