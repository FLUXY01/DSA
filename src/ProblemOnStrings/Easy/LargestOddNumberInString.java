package ProblemOnStrings.Easy;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String s = "5347";
        System.out.println(largestOddNumberInString(s));
    }
    public static String largestOddNumberInString(String s){
        int i = s.length()-1;
        while (i>=0){
            if ((s.charAt(i) -'0')% 2 != 0){
                return s.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
}
