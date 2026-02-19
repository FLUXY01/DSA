package ProblemOnArrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int nums = 3;
        System.out.println(linearSearch(arr,nums));
    }
    public static int linearSearch(int[]arr, int nums){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == nums){
                return (i);
            }
        }
        return -1;
    }
}
