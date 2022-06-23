package AlgoExercises;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> c = new ArrayList<Integer>();

        for (Integer i : a) {
            b.add(i);
        }
        a.addAll(b);

        for (int i = 0; i <= d; i++) {
            c.add(a.get(d + i));
        }
        return c;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        int d = 4;

        System.out.println(rotLeft(a, d));
    }
}
