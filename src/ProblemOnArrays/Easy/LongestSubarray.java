package ProblemOnArrays.Easy;

public class LongestSubarray {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarray(arr,k));
    }
    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLength = 0;

        for (int startIndex = 0; startIndex < n; startIndex++) {
            for (int endIndex = startIndex; endIndex < n; endIndex++) {

                int currentSum = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    currentSum += nums[i];
                }

                if (currentSum == k) {
                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                }
            }
        }
        return maxLength;
    }
}
