package ProblemOnArrays.Easy;
import java.util.HashMap;

public class LongestSubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = arr.length;
        System.out.println(longestSubArrayWithSum(arr, n));
    }

    public static int longestSubArrayWithSum(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}