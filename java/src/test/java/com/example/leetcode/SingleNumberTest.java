package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    private SingleNumber solution = new SingleNumber();

    @Test
    public void test1() {
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}