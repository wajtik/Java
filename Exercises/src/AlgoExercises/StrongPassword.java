package AlgoExercises;

public class StrongPassword {
    static int minimumNumber(int n, String password) {
        int countDigit = 0;
        int countLower = 0;
        int countUpper = 0;
        int countSpecial = 0;
        int addCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                countDigit++;
            } else if (Character.isLowerCase(c)) {
                countLower++;
            } else if (Character.isUpperCase(c)) {
                countUpper++;
            } else {
                countSpecial++;
            }
        }
        if (countDigit == 0) {
            addCount++;
            countDigit++;
        }
        if (countLower == 0) {
            addCount++;
            countLower++;
        }
        if (countUpper == 0) {
            addCount++;
            countUpper++;
        }

        if (countSpecial == 0) {
            addCount++;
            countSpecial++;
        }

        int total = countDigit + countLower + countSpecial + countUpper;

        // check if total length is 6 or less
        if (total - 6 < 0) {
            addCount += 6 - total;
        }
        return addCount;
    }
}
