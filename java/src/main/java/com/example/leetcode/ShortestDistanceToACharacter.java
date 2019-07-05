package com.example.leetcode;

public class ShortestDistanceToACharacter {

    int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        int[] result = new int[chars.length];

        int preHold = indexOf(chars, C, -1);
        int postHold = indexOf(chars, C, preHold);

        for (int i = 0; i < chars.length; i++) {
            if (postHold == -1 && i < preHold) {
                result[i] = preHold - i;
            } else if (postHold == -1 && i > preHold) {
                result[i] = i - preHold;
            } else if (i < preHold) {
                result[i] = preHold - i;
            } else if (i == preHold) {
                result[i] = 0;
            } else if (i > preHold && i < postHold) {
                int preDis = i - preHold;
                int postDis = postHold - i;
                result[i] = preDis > postDis ? postDis : preDis;
            } else if (i > preHold && i == postHold) {
                result[i] = 0;
                preHold = postHold;
                postHold = indexOf(chars, C, postHold);
            }
        }

        return result;
    }

    int indexOf(char[] chars, char c, int fromIndex) {
        for (int i = fromIndex + 1; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
