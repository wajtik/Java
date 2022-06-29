package AlgoExercises;

import java.util.Stack;

public class SuperReduceString {
    public static String superReducedString(String s) {
        Stack<Character> myStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (myStack.isEmpty()) {
                myStack.push(c);
            } else if (c == myStack.peek()) {
                myStack.pop();
            } else {
                myStack.push(c);
            }
        }
        StringBuilder myBuilder = new StringBuilder();
        for (Character ch : myStack) {
            myBuilder.append(ch);
        }

        return myBuilder.length() == 0 ? "Empty String" : myBuilder.toString();
    }
}
