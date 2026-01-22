package recursion;

import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(SumOfNNaturalNumbers(n));
        System.out.println(sumOfNNaturalNumberRecursive(n));
    }
    //Without Recursion
    public static int SumOfNNaturalNumbers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // Recursive Case
    public static int sumOfNNaturalNumberRecursive(int N){
        if(N == 1){
            return 1;
        }
        return N + sumOfNNaturalNumberRecursive(N-1);
    }
}
