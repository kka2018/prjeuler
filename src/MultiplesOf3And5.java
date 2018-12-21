import java.util.Scanner;

/*
Given a number N. Here is the program to find the sum of
numbers that are multiples of 3 or 5 and are less than N.
 */
public class MultiplesOf3And5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextInt() - 1; // We have taken long, in case, sum exceeds integer limit
                                        // Subtracted 1, so as to get the numbers less than N
            System.out.println((3 * (((n / 3) * ((n / 3) + 1)) / 2)) // Sum of multiples of 3
                    + (5 * (((n / 5) * ((n / 5) + 1)) / 2)) //  Sum of multiples of 5
                    - (15 * (((n / 15) * ((n / 15) + 1)) / 2))); // Sum of multiples of 15
        }

    }
}
