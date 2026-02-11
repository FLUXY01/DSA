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

        for (int j = low; j < high; j++) {// 1st j --> 0, 2nd j--> 1, 3rd j--> 2, 4th j--> 3, 5th j--> 4
            if (arr[j] <= pivot){ // 1st arr[j] --> 10, 2nd arr[j]--> 7, 3rd j--> 8, 4th j--> 9, 5th j--> 1
                i++; //5th i--> 0
                int temp = arr[i];// temp--> arr[0]--> 10
                arr[i] = arr[j];// arr[0]--> 1
                arr[j] = temp;// arr[4]--> 10
            }
        }
        int temp = arr[i+1];// temp--> arr[i+1]--> 7
        arr[i+1] = arr[high];// arr[i+1]--> arr[high]--> 5 so, arr[1]--> 5
        arr[high] = temp;// arr[high]--> temp--> 7 so, arr[5]--> 7

        return i+1;// 1
    }
}
