package ProblemOnArrays.Hard;

import java.util.HashMap;

public class CountSubArraysWithXOR {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(Solution(arr,k));
    }
    public static int Solution(int[]nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0; i< nums.length;i++){
            prefixSum ^= nums[i];
            int target = prefixSum ^ k;
            if (map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
