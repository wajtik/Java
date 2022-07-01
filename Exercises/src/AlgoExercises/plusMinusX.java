package AlgoExercises;

import java.util.List;

public class plusMinusX {
    public static void plusMinus(List<Integer> arr) {
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        int arrSize = arr.size();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                sum1++;
            } else if (arr.get(i) < 0) {
                sum2++;
            } else if (arr.get(i) == 0) {
                sum3++;
            }
        }

        System.out.println(sum1 / arrSize);
        System.out.println(sum2 / arrSize);
        System.out.println(sum3 / arrSize);
    }
}
