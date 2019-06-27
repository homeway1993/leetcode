package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}