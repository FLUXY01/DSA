package ProblemOnStrings.Easy;

public class RemoveOutermostParanth {
    public static void main(String[] args) {
        String s = "((()))";
        removeOuterParanth(s);
    }
    public static void removeOuterParanth(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;
        for (char ch : s.toCharArray()){
            if(ch == '('){
                if (level > 0) result.append(ch);
                level++;
            } else if (ch == ')') {
                level--;
                if (level>0)  result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
