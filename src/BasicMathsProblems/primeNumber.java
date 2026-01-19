package BasicMathsProblems;

public class primeNumber {
    public static void main(String[] args) {
        boolean checker = primeNumberChecker(6);
        System.out.println(checker);
    }

    public static boolean primeNumberChecker(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
