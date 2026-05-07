package ProblemOnArrays.Hard;
import java.util.ArrayList;
import java.util.List;


public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,4};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        int can1= 0, can2 = 0;
        for (int num : nums){
            if(num == can1){
                cnt1++;
            }
            else if(num == can2){
                cnt2++;
            } else if (cnt1 == 0) {
                can1 = num;
                cnt1++;
            } else if (cnt2 == 0) {
                can2 = num;
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 =0;
        cnt2 =0;
        for (int num : nums){
            if(num == can1){
                cnt1++;
            } else if (num == can2) {
                cnt2++;
            }
        }
        if (cnt1>n/3){
            list.add(can1);
        }
        if(cnt2>n/3){
            list.add(can2);
        }
        return list;
    }
}
