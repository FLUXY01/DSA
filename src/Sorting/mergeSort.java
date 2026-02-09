package Sorting;

import java.util.ArrayList;
import java.util.List;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr = {5,2,6,12,6,787,23};
        int low = 0;
        int high = arr.length - 1;
        MergeSort(arr,low,high);
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void MergeSort(int[]arr, int low, int high){
        if (low >= high){
            return;
        }
        int mid = low + (high - low)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr, mid + 1, high);
        Merge(arr,low,mid,high);
    }
    public static void Merge(int[]arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high){
            if (arr[left] < arr[right]){
                temp.add(arr[left++]);
            }
            else {
                temp.add(arr[right++]);
            }
        }
        while (left <= mid){
            temp.add(arr[left++]);
        }
        while (right <= high){
            temp.add(arr[right++]);
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}

