package BasicMathsProblems;

import java.util.ArrayList;
import java.util.List;

public class printAllDivisor {
    public static void main(String[] args) {
        List<Integer> allDivisor = PrintAllDivisor(12);
        System.out.println(allDivisor);
    }
    public static List<Integer> PrintAllDivisor(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                list.add(i);
            }
        }
        return list;
    }
}
