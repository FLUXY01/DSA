package recursion;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sol.FibonacciSeriesBruteForce(n);
    }
}
class Solution{
    public void FibonacciSeriesBruteForce(int n){
        if (n == 0){
            System.out.println("0");
        }
        else if(n == 1){
            System.out.println("0 1");
        }
        else{
            int [] array = new int[n+1];
            array[0] = 0;
            array[1] = 1;
             for (int i = 2; i <= n; i++) {
                array[i] = array[i - 1] + array[i - 2]; //Fibonacci rule F(n) = F(n-1) + F(n-2)
            }
            System.out.println("The fibonacci series up to" + n + "th term:");
            for (int num : array){
                System.out.print(num+" ");
            }
        }
    }
}
