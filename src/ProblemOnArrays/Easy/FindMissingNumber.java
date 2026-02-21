package ProblemOnArrays.Easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[]arr){
        for (int i = 1; i <= arr.length+1; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length ; j++) {
                if (i == arr[j]){
                    found = true;
                    break;
                }
            }
            if (!found){
                return i;
            }
        }
        return -1;
    }
}
