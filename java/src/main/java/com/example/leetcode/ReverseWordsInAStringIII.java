package com.example.leetcode;


public class ReverseWordsInAStringIII {

    String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String newString = "";
        for (int i = 0; i < s1.length; i++) {
            char[] chars = s1[i].toCharArray();
            int charLen = chars.length;
            char[] newChars = new char[charLen];

            int index = 0;
            for (char aChar : chars) {
                newChars[charLen - ++index] = aChar;
            }

            newString = newString.concat(" ").concat(new String(newChars));
        }

        return newString.replaceFirst(" ", "");
    }
}
