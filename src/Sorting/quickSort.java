package Sorting;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};
        QuickSort(arr,0,arr.length-1);
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void QuickSort(int[] arr, int low, int high){
        if (low<high){
            int pivotIndex = partition(arr,low,high);

            QuickSort(arr,low,pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // First Iteration Only
        int pivot = arr[high]; // pivot --> arr[high] --> 5

        int i = low - 1; // i --> -1

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
