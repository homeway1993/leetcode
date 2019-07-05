package com.example.leetcode;

public class ShortestDistanceToACharacter {

    int[] shortestToChar(String S, char C) {
        int length = S.length();
        int[] result = new int[length];
        int prev = -10000;

        for (int i = 0; i < length; ++i) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            result[i] = i - prev;
        }

        prev = 10000;

        for (int i = length - 1; i >= 0; --i) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }

        return result;
    }
}
