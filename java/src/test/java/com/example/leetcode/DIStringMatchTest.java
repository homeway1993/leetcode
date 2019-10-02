package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DIStringMatchTest {

    private DIStringMatch diStringMatch = new DIStringMatch();

    @Test
    public void test1() {
        // prepare
        String input = "IDID";
        int[] output = {0, 4, 1, 3, 2};

        // validate
        assertArrayEquals(output, diStringMatch.diStringMatch(input));
    }

    @Test
    public void test2() {
        // prepare
        String input = "III";
        int[] output = {0, 1, 2, 3};

        // validate
        assertArrayEquals(output, diStringMatch.diStringMatch(input));
    }

    @Test
    public void test3() {
        // prepare
        String input = "DDI";
        int[] output = {3, 2, 0, 1};

        // validate
        assertArrayEquals(output, diStringMatch.diStringMatch(input));
    }
}