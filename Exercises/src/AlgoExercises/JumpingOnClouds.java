package AlgoExercises;

import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int sum = 0;
        int[] c1 = c.stream().mapToInt(i -> i).toArray();

        for (int i = 0; i < c1.length - 1; i++) {
            if (i < c1.length - 2) {
                if (c1[i + 2] != 1) {
                    sum++;
                    i++;
                } else {
                    sum++;
                }
            } else {
                sum++;
            }

        }
        return sum;
    }

}
