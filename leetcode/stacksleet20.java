package leetcode;

import java.util.*;

public class stacksleet20 {
    public static void main() {
        String s = "()";

        System.out.println(checkvalidparan(s));
    }

    public static boolean checkvalidparan(String s) {
        Stack<Character> stack = new Stack<>();
        for( char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (stack.isEmpty() == true){
                    return true;
                }

                if ((c == ')' && stack.peek() == '(') ||
                        (c == '}' && stack.peek() == '{') ||
                        (c == ']' && stack.peek() == '[')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
