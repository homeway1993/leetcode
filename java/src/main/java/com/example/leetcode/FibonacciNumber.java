package com.example.leetcode;

public class FibonacciNumber {

    public int fib(int N) {
        return dynamicProgramming2(N);
    }

    private int recursively(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return recursively(N - 1) + recursively(N - 2);
    }

    private int dynamicProgramming(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        int[] result = new int[N + 1];
        result[1] = 1;

        for (int i = 2; i < N + 1; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[N];
    }

    private int dynamicProgramming2(int N) {
        if (N < 2) {
            return N;
        }

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 2; i <= N ; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
