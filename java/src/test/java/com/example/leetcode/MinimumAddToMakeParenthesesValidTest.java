package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumAddToMakeParenthesesValidTest {

    private MinimumAddToMakeParenthesesValid solution = new MinimumAddToMakeParenthesesValid();

    @Test
    public void test() {
        // prepare
        String S = "())";

        int result = solution.minAddToMakeValid(S);

        // verify
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        // prepare
        String S = "(((";

        int result = solution.minAddToMakeValid(S);

        // verify
        assertEquals(3, result);
    }

    @Test
    public void test3() {
        // prepare
        String S = "()";

        int result = solution.minAddToMakeValid(S);

        // verify
        assertEquals(0, result);
    }

    @Test
    public void test4() {
        // prepare
        String S = "()))((";

        int result = solution.minAddToMakeValid(S);

        // verify
        assertEquals(4, result);
    }

    @Test
    public void test5() {
        // prepare
        String S = "()()()";

        int result = solution.minAddToMakeValid(S);

        // verify
        assertEquals(0, result);
    }

    @Test
    public void test6() {
        // prepare
        String S = "(()())((";

        int result = solution.minAddToMakeValid(S);

        // verify
        assertEquals(2, result);
    }
}