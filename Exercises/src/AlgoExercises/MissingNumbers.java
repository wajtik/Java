package AlgoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers {

    public static void main(String[] args) {
        System.out.println(MissingNumbers.missingNumbers(num));
    }

    static List<Integer> num = Arrays.asList(1, 2, 3, 6, 9, 10, 99, 100);
    static List<Integer> missingNum = new ArrayList<>();

    public static List<Integer> missingNumbers(List<Integer> num) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == num.get(j)) {
                j++;
            } else {
                missingNum.add(i);
            }
        }
        return missingNum;
    }

}