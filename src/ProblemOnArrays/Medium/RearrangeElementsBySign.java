package ProblemOnArrays.Medium;


public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        rearrangeElement(arr);
    }
    public static void rearrangeElement(int[]arr){
        int [] result = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                result[negIndex] = arr[i];
                negIndex += 2;
            }
            else{
                result[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        for(int nums:result)
            System.out.println(nums);
    }
}
