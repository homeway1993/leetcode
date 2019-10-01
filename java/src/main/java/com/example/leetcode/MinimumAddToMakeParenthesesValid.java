package com.example.leetcode;

public class MinimumAddToMakeParenthesesValid {

    public int minAddToMakeValid(String S) {
        int stage = 0;
        int total = 0;

        for (char c : S.toCharArray()) {
            if (c == '(') {
                stage++;
            } else if (c == ')') {
                stage--;
            }

            if (stage == -1) {
                stage++;
                total++;
            }
        }
        return total + stage;
    }
}
