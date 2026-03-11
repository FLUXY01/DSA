package ProblemOnArrays.Medium;
import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        leaderInArray(arr);
    }
    public static void leaderInArray(int[]arr){
        List<Integer> list = new ArrayList<>();
        int leader = arr[arr.length-1];
        list.add(leader);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] > leader) {
                leader = arr[i - 1];
                list.add(leader);
            }
        }
        reverse(list,0,list.size()-1);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list, int start, int end){
        while (start<end){
            swap(list,start,end);
            start++;
            end--;
        }
    }
    public static void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
