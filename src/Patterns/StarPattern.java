package Patterns;

import java.util.Scanner;

public class StarPattern {
    /*
     *****
     *****
     *****
     *****
     *****
     */

    public static void starPatternOne(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*
     *
     **
     ***
     ****
     *****
     */

    public static void starPatternTwo(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*
     *****
     ****
     ***
     **
     *
     */
    public static  void starPatternThree(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*
      *
     ***
    *****
   *******
  *********
     */
    public static  void starPatternFour(int n){
        int count;
        count = 1;
        for (int i = 0; i < n; i++) {
            //for leading space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            // for trailing spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            count += 2;
            System.out.println(" ");
        }

    }
    /*
  *********
   *******
    *****
     ***
      *
     */
    public static void starPatternFive(int n){
        int count;
        count = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            count -= 2;
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
//        starPatternOne(5);
//        starPatternTwo(5);
//        starPatternThree(5);
//        starPatternFour(5);
        starPatternFive(5);
    }
}
