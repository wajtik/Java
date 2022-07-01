package EXAM;

public class exam {

    public static int camelCase(String s) {
        int count = 1;

        if (s.isEmpty()) {
            count = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "";

        System.out.println(camelCase(s));
    }

}
