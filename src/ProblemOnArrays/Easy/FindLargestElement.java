package ProblemOnArrays.Easy;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        int low = 0;
        int high = arr.length-1;
        QuickSort(arr,low,high);
        System.out.println(arr[high]);
    }
    public static void QuickSort(int[]arr, int low, int high){
        if (low<high){
            int pivotIndex = PivotIndex(arr,low,high);
            QuickSort(arr,low,pivotIndex-1);
            QuickSort(arr,pivotIndex+1,high);
        }
    }
    public static int  PivotIndex(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<pivot){
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
