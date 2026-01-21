package recursion;

public class printNToOneTimes {
    public static void main(String[] args) {
        PrintNToOneTimes(6);
    }
    public static void PrintNToOneTimes(int n){
        if (n == 0){
            return;
        }
        PrintNToOneTimes(n-1);
        System.out.println(n);

    }
}
