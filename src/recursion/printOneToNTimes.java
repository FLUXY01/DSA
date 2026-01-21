package recursion;

public class printOneToNTimes {
    public static void main(String[] args) {
        PrintOneToNTimes(1,4);
    }
    public static void PrintOneToNTimes(int current,int n){
        if (current > n){
            return;
        }
        System.out.println(current);
        PrintOneToNTimes(current + 1, n);
    }
}
