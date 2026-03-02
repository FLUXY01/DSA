package ProblemOnArrays.Easy;

public class CountMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){

                count++;
            } else if (arr[i] == 0) {
                count = 0;
            }
            max_count = Math.max(max_count,count);
        }
        System.out.println(max_count);
    }
}
