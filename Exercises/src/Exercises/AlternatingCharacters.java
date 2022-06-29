package Exercises;
public class AlternatingCharacters {
    /*You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. 
    To do this, you are allowed to delete zero or more characters in the string. Your task is to find the minimum number of required deletions.

Example:  Remove an  at positions  and  to make  in  deletions. */

    public static int alternatingCharacters(String s) {
       int sum = 0;

                    for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                sum++;
            }
        }
        return sum;
        }

}
