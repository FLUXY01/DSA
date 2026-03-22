package ProblemOnStrings.Easy;

public class RotateString {
    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s,String goal){
        String word = s+s;
        if (s.length() != goal.length()){
            return false;
        }
        return word.contains(goal);
    }
}
