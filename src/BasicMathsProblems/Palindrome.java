package BasicMathsProblems;

public class Palindrome {
    public static void main(String[] args) {
        boolean isPalindrom = isPalindrom(121);
        System.out.println(isPalindrom);
    }
    public static boolean isPalindrom(int x){
        int revNum = 0;
        int isPalindrome = x;
        while(isPalindrome > 0){
            int lastDigit = isPalindrome % 10;
            revNum = revNum * 10 + lastDigit;
            isPalindrome /= 10;
        }
        return revNum == x;
    }
}
