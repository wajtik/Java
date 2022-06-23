package AlgoExercises;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        Map<Character, Integer> map = new HashMap<>();
           int count = 0;
           for(int i=0;i<a.length();i++){
               if(map.get(a.charAt(i)) == null){
                   map.put(a.charAt(i), 1);
               } else {
                   map.put(a.charAt(i), map.get(a.charAt(i))+1);
               }
           }
           for(int i=0;i<b.length();i++){
               if(map.containsKey(b.charAt(i))){
                   if(map.get(b.charAt(i)) == 1){
                      map.remove(b.charAt(i)); 
                   } else {
                       map.put(b.charAt(i), map.get(b.charAt(i))-1);
                   }
               } else {
                   count++;
               }
           }          
           for(Integer i: map.values()){
               count=count+i;
           }   
           return count;
        }   

        public static void main(String[] args) {
            String a = "cade";
            String b = "abac";

            System.out.println(makeAnagram(a, b));
        }
    
}
