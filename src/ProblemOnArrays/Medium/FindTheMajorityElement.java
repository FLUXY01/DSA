package ProblemOnArrays.Medium;

import java.util.HashMap;

public class FindTheMajorityElement {
    public static void main(String[] args) {
        int [] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(findTheMajorityElement(arr));
    }
    public static int findTheMajorityElement(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for (int nums : arr) {
            map.put(nums,map.getOrDefault(nums,0)+1); // best way to count the numbers in array

            if(map.get(nums) > n/ 2){
                return nums;
            }
        }
        return -1;
    }
}
