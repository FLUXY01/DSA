package ProblemOnArrays.Hard;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPos(arr));
    }
    public static int firstMissingPos(int[]arr){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
