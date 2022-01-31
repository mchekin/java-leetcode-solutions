package com.mchekin.leetcodesolutions.longestcommonprefix.binarysearch;

/**
 * Problem: <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 *
 * <p>
 * Time Complexity: O(n*m*log(m)) (where n is the number of strings and m is the number of characters a string)
 * Space Complexity: O(1)
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        int low = 1;
        int high = getMinimumLength(strs);

        while (low <= high) {
            int middle = (low + high) / 2;

            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return strs[0].substring(0, (low + high) / 2);
    }

    private int getMinimumLength(String[] strs) {
        int minimumLength = Integer.MAX_VALUE;

        for (String str : strs) {
            minimumLength = Math.min(minimumLength, str.length());
        }

        return minimumLength;
    }

    private boolean isCommonPrefix(String[] strs, int length) {
        String lookupSubstring = strs[0].substring(0, length);

        for (int i = 1; i < strs.length; i++) {

            String currentString = strs[i];

            if (!currentString.startsWith(lookupSubstring)) {
                return false;
            }
        }

        return true;
    }
}
