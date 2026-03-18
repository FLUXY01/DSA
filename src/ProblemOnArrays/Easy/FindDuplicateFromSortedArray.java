package ProblemOnArrays.Easy;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2};
       findDuplicateFromSortedArray(arr);
        //System.out.println(optimized(arr));
    }
    public static void findDuplicateFromSortedArray(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num: arr){
            map.put(num,map.getOrDefault(map.get(num),0)+1);
        }
        System.out.println(map.size());
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
