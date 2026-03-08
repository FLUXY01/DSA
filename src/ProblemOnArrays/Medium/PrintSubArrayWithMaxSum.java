package ProblemOnArrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class PrintSubArrayWithMaxSum {

    public static void main(String[] args) {
        int[] arr = {-5, -2, 3, 4, 6, -1, 2};
        System.out.println(printSubArrayWithMaxSum(arr));
    }

    public static List<Integer> printSubArrayWithMaxSum(int[] arr) {

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < arr.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = ansStart; i <= ansEnd; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}