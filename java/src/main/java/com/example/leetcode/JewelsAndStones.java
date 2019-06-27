package com.example.leetcode;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        char[] sSplit = S.toCharArray();
        int sum = 0;

        for (char j : J.toCharArray()) {
            for (char s : sSplit) {
                if (j == s) {
                    sum++;
                }
            }
        }

        return sum;
    }
}
