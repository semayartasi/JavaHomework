package homework;

public class Fibonacci {
    //    Fibonacci Number
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), for N > 1.
//Given N, calculate F(N).
//
//
//
//Example 1:
//
//Input: 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//Example 2:
//1, 1, 2, 3, 5, 8
//1  2  3  4  5  6
//Input: 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
//Example 3:
//
//Input: 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


        static int fibonacci(int N) {
            int first = 1;
            int second = 1;
            int fibNum = 0;


            if (N == 0 || N == 1) {
                return N;
            } else if (N < 0) {
                System.out.println("Please enter positive number");
                return -1;
            } else {
                for (int i = 0; i < N; i++) {
                    fibNum = first + second;
                    first = second;
                    second = fibNum;
                    System.out.println(fibNum);
                }
                return fibNum;
            }
        }

        public static long fib(long n) {
            if ((n == 0) || (n == 1))
                return n;
            else
                return fib(n - 1) + fib(n - 2);
        }

        public static void main(String[] args) {

            String word = "sena";
            String word2 = "sena";
            if(word.equals(word2)) {
                System.out.println("equals");
            }
            if(word == word2) {
                System.out.println("==");
            }

            if(word.contains("e") && word.contains("a")) {
                System.out.println("hem \"e\" hem de \"a\" vardir");
            }


            System.out.println("The 0th fibonacci number is: " + fib(0));
            System.out.println("The 7th fibonacci number is: " + fib(7));
            System.out.println("The 12th fibonacci number is: " + fib(12));
        }
}
