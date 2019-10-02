package com.example.leetcode;

public class DIStringMatch {

    public int[] diStringMatch(String S) {
        int max = S.length();
        int min = 0;
        int[] result = new int[max + 1];
        char[] chars = S.toCharArray();

        for (int i = 0; i < S.length(); i++) {
            if (chars[i] == 'D') {
                result[i] = max--;
            } else if (chars[i] == 'I') {
                result[i] = min++;
            }
        }
        result[S.length()] = min;

        return result;
    }
}
