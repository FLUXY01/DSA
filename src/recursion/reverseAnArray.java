package recursion;

public class reverseAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        BruteForceApproach brute = new BruteForceApproach();
        int [] result = brute.ReverseAnArray(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        int [] array = {10,20,30,40,50};
        OptimalApproach optimal = new OptimalApproach();
        optimal.ReverseArray(array);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
// optimal approach
class OptimalApproach {
    public  void ReverseArray(int[] n) {
        int p1 = 0;
        int p2 = n.length - 1;
        while (p1 < p2) {
            int temp = n[p1];
            n[p1] = n[p2];
            n[p2] = temp;
            p1++;
            p2--;
        }
    }
}
//Brute force approach
class BruteForceApproach {
    public  int[] ReverseAnArray(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int n = arr.length;
        int[] reverseArray = new int[n];
        for (int i = 0; i < n; i++) {
            // for reversing the array
            reverseArray[i] = arr[n - 1 - i];
        }
        return reverseArray;
    }
}
