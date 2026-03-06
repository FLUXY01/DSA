package ProblemOnArrays.Medium;

public class SortArrayZeroesOnesTwos {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0};
        int low = 0;
        int high = arr.length-1;
        QuickSort(arr,low,high);
        for (int num: arr){
            System.out.println(num);
        }
    }
    public static void QuickSort(int[]arr,int low, int high){
        if (low<high) {
            int pivot = PivotIndex(arr, low, high);
            QuickSort(arr,low,pivot-1);
            QuickSort(arr,pivot+1,high);
        }
    }
    public static int PivotIndex(int[]arr,int low, int high){
        int pi = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<pi){
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
