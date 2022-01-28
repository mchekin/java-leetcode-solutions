package com.mchekin.leetcodesolutions.longestcommonprefix.verticalscanning;

/**
 * Problem: <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 *
 * <p>
 * Time Complexity: O(n*m) (where n is the number of strings and m is the number of characters a string)
 * Space Complexity: O(1)
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String first = strs[0];

        int i = 0;

        outerLoop:
        while (i < first.length()) {

            for (String current : strs) {
                if (current.length() <= i || current.charAt(i) != first.charAt(i)) {
                    break outerLoop;
                }
            }

            i++;
        }

        return first.substring(0, i);
    }
}
