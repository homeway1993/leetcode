package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStonesTest {

    private JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @Test
    public void test1() {
        String J = "aA", S = "aAAbbbb";

        int result = jewelsAndStones.numJewelsInStones(J, S);
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        String J = "z", S = "ZZ";

        int result = jewelsAndStones.numJewelsInStones(J, S);
        assertEquals(0, result);
    }
}