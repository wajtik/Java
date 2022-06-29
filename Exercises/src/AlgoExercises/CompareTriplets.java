package AlgoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.addAll(Arrays.asList(17, 28, 30));

        List<Integer> b = new ArrayList<Integer>();
        b.addAll(Arrays.asList(99, 16, 8));

        System.out.println(compareTriplets(a, b));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> arr = new ArrayList<Integer>();

        int aa = 0;
        int bb = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aa++;
            } else if (a.get(i) < b.get(i)) {
                bb++;
            }
        }
        arr.add(aa);
        arr.add(bb);

        return arr;
    }
}
