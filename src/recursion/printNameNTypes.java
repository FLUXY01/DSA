package recursion;

public class printNameNTypes {

    public static void main(String[] args) {
        PrintNameNTimes(5);
    }

    public static void PrintNameNTimes(int n){
        if(n == 0){
            return;
        }
        System.out.println("Ashish");
        PrintNameNTimes(n-1);
    }

}
