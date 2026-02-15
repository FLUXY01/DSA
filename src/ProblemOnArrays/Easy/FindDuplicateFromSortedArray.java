package ProblemOnArrays.Easy;

import java.util.HashSet;

public class FindDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2};
        System.out.println(findDuplicateFromSortedArray(arr));
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
}
