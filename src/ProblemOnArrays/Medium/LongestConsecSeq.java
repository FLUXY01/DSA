package ProblemOnArrays.Medium;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecSeq {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println(longestConsecSeq(arr));
    }
    public static int longestConsecSeq(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // start of sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
