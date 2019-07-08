package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IslandPerimeterTest {

    private IslandPerimeter solution = new IslandPerimeter();

    @Test
    public void test() {
        // prepare
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        int result = solution.islandPerimeter(grid);
        assertEquals(16, result);
    }
}