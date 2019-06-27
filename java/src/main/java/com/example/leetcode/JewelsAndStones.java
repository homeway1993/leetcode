package com.example.leetcode;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        String[] sSplit = S.split("");

        int sum = 0;
        for (String j : J.split("")) {
            for (String s : sSplit) {
                if (j.equals(s)) {
                    sum++;
                }
            }
        }

        return sum;
    }
}
