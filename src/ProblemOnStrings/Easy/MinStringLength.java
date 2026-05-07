package ProblemOnStrings.Easy;

public class MinStringLength {

    static int minLength(String s)
    {
        // Initialize two pointers
        int i = 0, j = s.length() - 1;

        // Traverse the string
        while (i < j && s.charAt(i) == s.charAt(j)) {

            // Current character
            char d = s.charAt(i);

            // Move i forward
            while (i <= j && s.charAt(i) == d)
                i++;

            // Move j backward
            while (i <= j && s.charAt(j) == d)
                j--;
        }

        // Return remaining length
        return j - i + 1;
    }

    public static void main(String[] args) {

        String s1 = "aacbcca";
        String s2 = "aabcccabba";

        //System.out.println("Result for " + s1 + " = " + minLength(s1));
        System.out.println("Result for " + s2 + " = " + minLength(s2));
    }
}