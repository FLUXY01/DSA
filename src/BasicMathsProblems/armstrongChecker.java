package BasicMathsProblems;

public class armstrongChecker {
    public static void main(String[] args) {
        boolean check = ArmstrongChecker(153);
        System.out.println(check);
    }
    public static boolean ArmstrongChecker(int n){
        int k = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        while(num>0){
            int ld = num % 10;
            sum += Math.pow(ld,k);
            num /= 10;
        }
        return sum == n;
    }
}
