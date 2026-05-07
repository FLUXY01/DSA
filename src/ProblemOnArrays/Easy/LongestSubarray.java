package ProblemOnArrays.Easy;

public class LongestSubarray {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarray(arr,k));
    }
    public static int longestSubarray(int[] nums, int k) {
        int left = 0, right = 0;
        int sum = 0, maxLen = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }
        return maxLen;
    }
}
