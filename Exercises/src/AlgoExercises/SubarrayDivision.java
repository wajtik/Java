package AlgoExercises;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++)
                sum += s.get(j);
            if (sum == d) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1, 2, 1, 1, 1);
        int d = 3;
        int m = 4;

        System.out.println(birthday(s, d, m));
    }
}
