package ProblemOnArrays.Medium;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;
        int[] result = optimisedTwoSum(arr, target);
        for (int nums: result){
            System.out.println(nums);
        }
    }
    public static int[] twoSum(int []arr, int n, int target){
        int[]nums = new int[2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                int currentSum = arr[i] + arr[j];
                if (currentSum == target) {
                        nums[0] = i;
                        nums[1] = j;
                        return nums;
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] optimisedTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){ // 2 6 5 8 11
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
