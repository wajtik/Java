package AlgoExercises;

import java.util.HashSet;
import java.util.List;

public class Gamestones {
    public static int gemstones(List<String> arr) {
        int count = 0;

        HashSet<String> charSet = new HashSet<String>();
        String firstString = arr.get(0);

        for (String c : firstString.split("")) {
            charSet.add(c);
        }

        for (String s : charSet) {
            Boolean exist = true;
            for (int i = 0; i < arr.size(); i++) {
                String thisLine = arr.get(i);
                if (!thisLine.contains(s)) {
                    exist = false;
                }
            }
            if (exist) {
                count++;
            }
        }

        return count;
    }

}
