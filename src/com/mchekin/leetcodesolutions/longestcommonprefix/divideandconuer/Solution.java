package com.mchekin.leetcodesolutions.longestcommonprefix.divideandconuer;

/**
 * Problem: <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 *
 * <p>
 * Time Complexity: O(n*m) (where n is the number of strings and m is the number of characters a string)
 * Space Complexity: O(m * log n)
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int left, int right) {

        if (left == right) {
            return strs[left];
        }

        int middle = (left + right) / 2;

        String lcpLeft = longestCommonPrefix(strs, left, middle);

        String lcpRight = longestCommonPrefix(strs, middle + 1, right);

        return commonPrefix(lcpLeft, lcpRight);

    }

    String commonPrefix(String left, String right) {

        int min = Math.min(left.length(), right.length());

        for (int i = 0; i < min; i++) {

            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }

        return left.substring(0, min);
    }
}
