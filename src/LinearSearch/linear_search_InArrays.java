package LinearSearch;

public class linear_search_InArrays {
    public static void main(String[] args) {
        int [] nums = {12,23,21,53,11,5,0,-34};
        int ans = linearSearchInArray(21,nums);
        System.out.println(ans);
    }
    static int linearSearchInArray(int target, int [] arr){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<= arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

}