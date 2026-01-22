package recursion;

public class factorialOfNumber {
    public static void main(String[] args) {
        System.out.println(FactorialOfNumber(5));
    }
    public static int FactorialOfNumber(int n){
        if(n == 1){
         return 1;
        }
        return n * FactorialOfNumber(n-1);
    }
}
