package ProblemOnArrays.Hard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        findTheElement sol1 = new findTheElement();
        System.out.println(sol1.element(5,3));
        findTheNthRow sol2 = new findTheNthRow();
        System.out.println(sol2.getNthRow(6));
        System.out.println(generatePascalTriangle(6));
    }
    public static List<List<Integer>> generatePascalTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
            for (int j = 1; j < i; j++) {
                row.set(j,triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}
class findTheNthRow{
    public List<Long> getNthRow(int N){
        List<Long> list = new ArrayList<>();
        long val = 1;
        list.add(val);
        for(int i = 1; i<N;i++){ // No. of rows = No. of cols
            val = val * (N-i)/ i;
            list.add(val);
        }
        return list;
    }
        }
class findTheElement{
    public long element(int row, int col){
        int n = row-1;
        int r = col-1;
        long result = 1;
        for(int i= 0; i<r; i++){
            result *= n-i;
            result /= i+1;
        }
        return result;
    }
}
