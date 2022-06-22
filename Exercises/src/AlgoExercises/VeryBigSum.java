package AlgoExercises;
import java.util.List;

class VeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for (Long el : ar) {
            sum += el;
        } 
        return sum;       
    }
}