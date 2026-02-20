package ProblemOnArrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {9,10,17,20};
        int n = arr1.length;
        int m = arr2.length;
        Union(arr1,arr2,n,m);
    }
    public static void Union(int[]arr1, int[]arr2, int n, int m) {
        List<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if (arr1[i]<arr2[j]){
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]){
                    temp.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (temp.isEmpty() || temp.get(temp.size() -1 ) != arr2[j]){
                    temp.add(arr2[j]);
                }
                j++;
            }
            else {
                if (temp.isEmpty() || temp.get(temp.size() -1 ) != arr1[i]){
                    temp.add(arr1[i]);
                }
                i++; j++;
            }
        }
        while (i < n){
            if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]){
                temp.add(arr1[i]);
            }
            i++;
        }
        while (j < m){
            if (temp.isEmpty() || temp.get(temp.size() - 1) != arr2[j]){
                temp.add(arr2[j]);
            }
            j++;
        }
        System.out.println(temp);
    }
}
