package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5};
        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i-1;
//            while (j>= 0 && arr[j] > key){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = key;
//        }
        insertionSort(arr,0,n);
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void insertionSort(int[] arr, int i, int n) {
        // Base case
        if (i == n) return;

        int j = i;
        // Move the current element back until it's in the correct place
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recur for the next index
        insertionSort(arr, i + 1, n);
    }
}
