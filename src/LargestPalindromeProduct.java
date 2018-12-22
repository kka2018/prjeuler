import java.util.Scanner;

/*
Given a integer n. Here is a program to find largest
product of two 3-digit numbers which is less than n
and is a palindrome.
Smallest such number is 101101 (= 143 * 707).
 */

public class LargestPalindromeProduct {

    // Method to check if a number is palindrome

    public static boolean isPalindrome(int number){
        int n = number;
        int reversedNumber = 0;
        while(n>0){
            reversedNumber = reversedNumber * 10 + n % 10;
            n = n/10;
        }
        if(number == reversedNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int largest = 101101;
            for(int i=100; i<1000; i++){ // We have to start checking from 100 and not
                for(int j=100; j<1000; j++){ // just from 143 and 707 or we will miss some numbers
                    if(isPalindrome(i * j) && ((i * j) > largest && (i * j) < n)){
                        largest = i * j;
                    }
                }
            }
            System.out.println(largest);
        }
    }
}