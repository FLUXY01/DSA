package Sorting;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,5,4};
        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1]; // 9
                    arr[j+1] = arr[j]; //10
                    arr[j] = temp;
                }
            }
        }
            for(int num : arr){
                System.out.println(num);
            }
    }
}
