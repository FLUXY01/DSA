package ProblemOnArrays.Easy;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArrayByOne(arr);
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void rotateArrayByOne(int[] nums) {
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }
}
