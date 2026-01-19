package recursion;

public class printNameNTypes {
    public static void main(String[] args) {
        PrintNameNTypes(3);
    }

    public static void PrintNameNTypes(int n){
        if (n == 0){
            return;
        }
        System.out.println("Vimanyu");
        PrintNameNTypes(n - 1);
    }
}
