package LeetCode;

public class reverseString {
    public static void main(String[] args) {
        String s = "abcde";
        char [] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        s = new String(arr);
        System.out.println(s);
    }
}
