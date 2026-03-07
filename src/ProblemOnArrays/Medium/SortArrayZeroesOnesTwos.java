package ProblemOnArrays.Medium;

public class SortArrayZeroesOnesTwos {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        sortZeroOneTwo(arr,low,mid,high);
        for (int num: arr){
            System.out.println(num);
        }
    }
    public static void sortZeroOneTwo(int[]arr, int low,int mid, int high){
        while( mid <= high){
            if (arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
