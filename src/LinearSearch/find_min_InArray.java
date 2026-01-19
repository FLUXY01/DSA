package LinearSearch;

public class find_min_InArray {
    public static void main(String[] args) {
        int [] array = {12,4,54,7,89,123,23};
        int ans = findMin(array);
        System.out.println(ans);
    }
    static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int linearSearchMin(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
