package com.example.leetcode;

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int xLen = grid.length;
        int yLen = grid[0].length;
        int result = 0;

        for (int x = 0; x < xLen; x++) {
            for (int y = 0; y < yLen; y++) {
                if (grid[x][y] == 0) {
                    continue;
                }

                if (x - 1 < 0 || grid[x - 1][y] == 0) {
                    result++;
                }

                if (x + 1 >= xLen || grid[x + 1][y] == 0) {
                    result++;
                }

                if (y - 1 < 0 || grid[x][y - 1] == 0) {
                    result++;
                }

                if (y + 1 >= yLen || grid[x][y + 1] == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
