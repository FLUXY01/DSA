package ProblemOnArrays.Medium;

public class SwapElementsWithStepK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 2;
        reverseAlt(arr,k);
        for (int num: arr){
            System.out.println(num);
        }
    }
    public static void reverseAlt(int[]arr,int k){
        for (int i = 1; i < arr.length; i += k) {
            if (arr[i] % k == 0){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }
}
