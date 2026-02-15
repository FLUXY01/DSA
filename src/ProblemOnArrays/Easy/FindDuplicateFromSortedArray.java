package ProblemOnArrays.Easy;

import java.util.HashSet;

public class FindDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {0,1,1,1,2,3,3,3};
       // System.out.println(findDuplicateFromSortedArray(arr));
        System.out.println(optimized(arr));
    }
    public static int findDuplicateFromSortedArray(int[]arr){
        int count = 0;
        HashSet<Integer> seek = new HashSet<>();
        for (int num: arr) {
            if (!seek.contains(num)){
                seek.add(num);
                arr[count] = num;
                count++;
            }
        }
        return count;
    }
    public static int optimized(int[]arr){
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count]) {
                count++;
                arr[count] = arr[i];
            }
        }

        return count + 1;
    }

}
