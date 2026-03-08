package ProblemOnArrays.Medium;

public class KadaneAlgorithmMaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, -2, 7, -4 };
        System.out.println(MaxSubArraySum(arr));
    }
    public static int MaxSubArraySum(int[]arr){
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) maxi;
    }
}
