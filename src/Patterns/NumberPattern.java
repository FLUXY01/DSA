package Patterns;

public class NumberPattern {
    /*
       1
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5
    */

    public  static void numberPatternOne(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");

        }
    }
    /*
    1
    22
    333
    4444
    55555
     */
    public  static void numberPatternTwo(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");

        }
    }
    /*
    12345
    1234
    123
    12
    1
     */
    public  static void numberPatternThree(int n){
        for (int i = 5; i >= n; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"");
            }
            System.out.println("");

        }
    }


    public static void main(String[] args) {
//        numberPatternOne(5);
//        numberPatternTwo(5);
        numberPatternThree(1);

    }
}
