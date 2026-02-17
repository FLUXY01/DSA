package ProblemOnArrays.Easy;

import java.util.Arrays;

public class RotateArrayByKElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        //rotateRight(arr,k);
        rotateLeft(arr,k);
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void rotateRight(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] temp = Arrays.copyOfRange(arr,n-k,n);
        for (int i = n-k-1; i >= 0; i--) {
            arr[i+k] = arr[i];
        }
        for (int i = 0; i <k; i++) {
            arr[i] = temp[i];
        }
    }
    public static void rotateLeft(int[]arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = Arrays.copyOfRange(arr,0,k);
        for (int i = k; i < n; i++) {
            arr[i-k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n-k+i] = temp[i];
        }
    }

}
