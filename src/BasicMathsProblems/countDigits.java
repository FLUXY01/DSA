package BasicMathsProblems;

public class countDigits {

    public static void main(String[] args) {
        int digits = CountDigits(12345);
        System.out.println(digits);
    }

    public static int CountDigits(int n){
        int count = 0;
        while(n>0){
            count += 1;
            n = n / 10;  //By doing this we are removing last digit of the number every time
        }
        return count;
    }

//     Using arrays
//    public static void CountDigits(int[] n){
//        int count = 0;
//        for (int i = 0; i < n.length; i++) {
//            count++;
//        }
//        System.out.println("Total Number of Digits: "+count);
//    }
}
