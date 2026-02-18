package ProblemOnArrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        //MoveZero(arr);
        moveZeroesOptimized(arr);
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void MoveZero(int[]arr){
        int n = arr.length;
        int count = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                count++;
                temp.add(arr[i]);
                arr[i] = 0;
            }
        }
        for (int i = 0; i < count ; i++) {
            arr[i] = temp.get(i);
        }
    }
    public static void moveZeroesOptimized(int[] nums) {
        int j = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}
