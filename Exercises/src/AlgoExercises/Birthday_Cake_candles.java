package AlgoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Birthday_Cake_candles {

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.addAll(Arrays.asList(3, 2, 1, 3));

        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int sum = 0;
        int maxNumber = Collections.max(candles);

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == maxNumber) {
                sum++;
            }
        }
        return sum;
    }
}
