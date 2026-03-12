package ProblemOnArrays.Medium;
import java.util.Arrays;

public class LongestConsecSeq {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        longestConsecSeq(arr);
    }
    public static void longestConsecSeq(int[] arr){
        Arrays.sort(arr);
        int count = 1;
        int max = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] == 1){
                count++;
            }
            else if(arr[i+1] == arr[i]){
                continue;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
