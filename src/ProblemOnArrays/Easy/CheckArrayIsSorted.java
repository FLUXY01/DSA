package ProblemOnArrays.Easy;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,3,5,6};
        System.out.println(checkArrayIsSorted(arr));
        }
        public static boolean checkArrayIsSorted(int[]arr){
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]){
                    return false;
                }
            }
        return true;
        }
    }

