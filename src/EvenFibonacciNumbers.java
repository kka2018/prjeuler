
import java.util.HashMap;
import java.util.Scanner;
/*
We are given a number N. We need to find the sum
of all the even fibonacci numbers that do not exceed N.
 */

public class EvenFibonacciNumbers {

    static HashMap<Long,Long> memo = new HashMap<>();

    // Function to calculate nth fibonacci number
    // using dynamic programming

    public static long fib(long n){
        if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        else if(memo.containsKey(n)){
            return memo.get(n);
        }
        else {
            long nthValue = fib(n - 1) + fib(n - 2);
            memo.put(n, nthValue);
            return nthValue;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long N = in.nextLong();
            long i = 1;
            long sum = 0;
            while(fib(i) <= N){
                if(fib(i) % 2 == 0){
                    sum = sum + fib(i);
                }
                i++;
            }
            System.out.println(sum);
        }
    }
}
