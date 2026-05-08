package ProblemOnArrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(solution(arr,target));
    }
    public static List<List<Integer>> solution(int[]nums, int target){
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < n; j++) {
                if (j>i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1;
                int right = n-1;
                while (left<right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left<right && nums[left] == nums[left-1]) left++;
                        while (left<right && nums[right] == nums[right+1]) right--;
                    } else if (sum<target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
