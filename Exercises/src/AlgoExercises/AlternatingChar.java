package AlgoExercises;

public class AlternatingChar {

    public static void alternatingCharacters(String s){
        int count = 0;

       for (int i = 0; i < s.length()-1; i++) {
         if(s.charAt(i) == s.charAt(i+1)) {
            count++;
         }


       }
       System.out.println(count);
    }
    public static void main(String[] args) {
        alternatingCharacters("AAAAA");
    }
}
