package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(new int[]{29,23,5,69,21,1,6});
    }
    public static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int num: arr){
            System.out.println(num);
        }
    }
}

