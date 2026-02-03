package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int [] nums = {23,41,45,1,7,78};
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i-1;

            while (j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for (int num : nums){
            System.out.println(num);
        }
    }
}
