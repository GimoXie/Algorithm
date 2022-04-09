package io.gimo.algorithm.book;

public class Fibonacci {

    public int recursion(int n) {
        int[] dict = new int[n + 1];
        return fib(n, dict);
    }

    private int fib(int n, int[] dict) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        if (dict[n] != 0) {
            return dict[n];
        }

        dict[n] = fib(n - 1, dict) + fib(n - 2, dict);
        return dict[n];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.recursion(20));
        System.out.println(fibonacci.iteration(20));
    }

    public int iteration(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

//        int[] dp = new int[n + 1];
//        dp[1] = dp[2] = 1;
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];

        int curr = 1, prev = 1;
        for (int i = 3; i <= n; i++) {
            int sum = curr + prev;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
