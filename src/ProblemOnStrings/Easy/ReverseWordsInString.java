package ProblemOnStrings.Easy;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWordsInString(s));
    }
    public static String reverseWordsInString(String s){
        StringBuilder result = new StringBuilder();
        int i  = s.length()-1;
        while (i>=0){
            while (i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            if (i<0) break;
            int end = i;

            while (i>= 0 && s.charAt(i) != ' '){
                i--;
            }
            String word = s.substring(i+1,end+1);
            if (!result.isEmpty()){
                result.append(' ');
            }
            result.append(word);
        }
        return result.toString();
    }
}
