package ProblemOnArrays.Easy;

public class LongestSubArrayWithSum {

    public static void main(String[] args) {
        int [] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = 8;
        System.out.println(longestSubArrayWithSum(arr,n));
    }
    public static int longestSubArrayWithSum(int[]arr,int n){
        int maxLength = 0;
        for (int startIndex = 0; startIndex<n; startIndex++){
            for (int endIndex = startIndex; endIndex<n; endIndex++){
                int currentSum = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    currentSum += arr[i];
                }
                if(currentSum == 0){
                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                }
            }
        }
        return maxLength;
    }
}
