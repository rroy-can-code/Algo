package com.practice.problems.string;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthSubstring {
    /**
     * Longest length substring without repeating character
     *
     * @param str
     * @return lengthOfLongestSubstringWithoutRepeatingChars
     */
    public int longestLengthSubstring(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("\\s", "");//replacing in between spaces
        System.out.println("trimmed string " + str);
        Map<Character, Integer> seen = new HashMap<Character, Integer>();
        int maxLen = 0;
        int start = 0;
        for (int end = 0; end < str.length(); end++) {
            if (seen.containsKey(str.charAt(end))) {
                start = Math.max(start, seen.get(str.charAt(end)) + 1);
            }
            seen.put(str.charAt(end), end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public int longestLengthSubstringUsingSB(String string) {
        StringBuilder sb = new StringBuilder();
        int n = string.length();
        int left = 0;
        int right = 0;
        int len = 0;
        while (right < n) {
            String s = String.valueOf(right);
            int index = sb.indexOf(s, left);
            if (index > -1) left = index + 1;
            sb.append(s);
            right++;
            len = Math.max(len, right - left);
        }
        return len;
    }

    /**
     * Longest substring without repeating characters
     */
    public String longestSubstringWithoutRepeatingChars(String str) {
        str = str.toLowerCase().trim().replaceAll("\\s", "");
        int i;
        int n = str.length();
        int st = 0;
        int currLen = 0;
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> pos = new HashMap<Character, Integer>();
        pos.put(str.charAt(0), 0);
        for (i = 1; i < n; i++) {
            if (!pos.containsKey(str.charAt(i))) {
                pos.put(str.charAt(i), i);
            } else {
                if (pos.get(str.charAt(i)) >= st) {
                    currLen = i - st;
                    if (maxLen < currLen) {
                        maxLen = currLen;
                        start = st;
                    }
                    st = pos.get(str.charAt(i)) + 1;
                }
                pos.replace(str.charAt(i), i);
            }
        }
        if (maxLen < i - st) {
            maxLen = i - st;
            start = st;
        }
        return str.substring(start, start + maxLen);
    }

}
