package ProblemOnStrings.Easy;

public class AnagramString {
    public static void main(String[] args) {
        String s = "CAT";
        String goal = "ACT";
        System.out.println(anagramString(s,goal));
    }
    public static boolean anagramString(String s, String goal){
        if (s.length() != goal.length()){
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[goal.charAt(i)]--;
        }
        for (int c : count){
            if (c != 0) return false;
        }
        return true;
    }
}
