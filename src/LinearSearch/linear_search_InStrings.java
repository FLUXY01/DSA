package LinearSearch;

public class linear_search_InStrings {
    public static void main(String[] args) {
        String name = "Vimanyu";
        char find = 'y';
        boolean ans = linearSearchInString(find,name);
        System.out.println(ans);
    }
    static boolean linearSearchInString(char target, String str ){

        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i <= str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
