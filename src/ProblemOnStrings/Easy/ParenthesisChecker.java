package ProblemOnStrings.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isBalancing(s));
    }
    public static boolean isBalancing(String s){
        Deque<Character> stack = new ArrayDeque<>();

        for (char c: s.toCharArray()){
            if(c == '['){
                stack.push(']');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(c == '('){
                stack.push(')');
            }
            else {
                if(stack.isEmpty() || stack.pop() != c ){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
