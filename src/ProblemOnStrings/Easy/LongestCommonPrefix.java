package ProblemOnStrings.Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[]s){
        StringBuilder result = new StringBuilder();
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length-1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)){
                return result.toString();
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}
