public class StairCase {  
    public static void staircase(int n) {  
      // loop
      for (int i=1; i <= n; i++) {
         // space
         for(int j=1; j <= n-i; j++)
         System.out.print(" ");

         // star
         for(int k=1; k <= i; k++)
         System.out.print("*");

         // new line
         System.out.println();
       }
    }
}


