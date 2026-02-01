package LeetCode;

public class reverseString {
    public static void main(String[] args) {
        String s = "a@#bcde";
        char [] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            while (left<right && !Character.isLetterOrDigit(arr[left])){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
