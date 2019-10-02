package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {

    private FibonacciNumber solution = new FibonacciNumber();

    @Test
    public void test() {
        System.currentTimeMillis();
        int result = solution.fib(2);

        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = solution.fib(3);

        assertEquals(2, result);
    }

    @Test
    public void test3() {
        int result = solution.fib(4);

        assertEquals(3, result);
    }

    @Test
    public void test4() {
        int result = solution.fib(20);

        assertEquals(6765, result);
    }
}