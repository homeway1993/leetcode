package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestDistanceToACharacterTest {

    private ShortestDistanceToACharacter solution = new ShortestDistanceToACharacter();

    @Test
    public void test() {
        String s = "loveleetcode";
        char c = 'e';

        int[] result = solution.shortestToChar(s, c);
        assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, result);
    }

    @Test
    public void test1() {
        String s = "aaba";
        char c = 'b';

        int[] result = solution.shortestToChar(s, c);
        assertArrayEquals(new int[]{2, 1, 0, 1}, result);
    }

    @Test
    public void test2() {
        String s = "aaab";
        char c = 'b';

        int[] result = solution.shortestToChar(s, c);
        assertArrayEquals(new int[]{3, 2, 1, 0}, result);
    }
}