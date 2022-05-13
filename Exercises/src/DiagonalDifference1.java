import java.util.List;

public class DiagonalDifference1 {


    public static int diagonalDifference(List<List<Integer>> arr) {

        int difference = 0;

        for (int i = 0; i < arr.size(); i++) {
            difference += arr.get(i).get(i) - arr.get(i).get((arr.get(i).size()-1)-i);
        }
        
        return Math.abs(difference);
    }
}
