package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringIIITest {

    private ReverseWordsInAStringIII solution = new ReverseWordsInAStringIII();

    @Test
    public void test() {
        String s = "Let's take LeetCode contest";

        String result = solution.reverseWords(s);
        assertEquals("s'teL ekat edoCteeL tsetnoc", result);
    }
}