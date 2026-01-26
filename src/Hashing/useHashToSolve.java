package Hashing;

import java.util.Scanner;

public class useHashToSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*
        For example arr[] = {1,2,3,1,4,5,2}
        In this hash what is actually happening is that when I am doing hash[arr[i]]
        so here arr[0] = 1; --> so hash[1] = 1
        arr[1] = 2; --> so hash[2] = 1
        arr[2] = 3; --> so hash[3] = 1;
        arr[3] = 1; --> so hash[1] = 2;
        */
        int [] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        while(n-- != 0){
            int number;
            /*
            Now in this when we provide number or query that we have to know how many times it
            repeated in the arr[] so
            number --> 1
            hash[1] = 2 it will print it will be repeated 2 times like this
             */
            number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
