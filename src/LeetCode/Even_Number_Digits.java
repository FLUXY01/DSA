package LeetCode;

public class Even_Number_Digits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    public static int findNumbers(int [] nums){
        int count = 0;
        if(nums.length == 0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int digits = String.valueOf(nums[i]).length();
            if(digits % 2 == 0){
                count ++;
            }
        }
        return count;
    }
}
