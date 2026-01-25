package Hashing;
// {1,2,1,3,2} array given
// now the number 1 appears how many times ot any number
public class BruteForceApproach {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,4,2};
        Solution sol = new Solution();
        int result = sol.givenArray(5,arr);
        System.out.println(result);
    }
}
class Solution{
    public int givenArray(int number, int [] array){
        int count  = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                count++;
            }
        }
        return count;
    }
}
