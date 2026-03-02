package ProblemOnArrays.Easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        System.out.println(xor);
    }
}
