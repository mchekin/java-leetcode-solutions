package com.mchekin.leetcodesolutions.longestcommonprefix.horizontalscanning;

/**
 * Problem: <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 *
 * <p>
 * Time Complexity: O(n*m) (where n is the number of strings and m is the number of characters a string)
 * Space Complexity: O(1)
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];
        int common = first.length();

        for (int i = 1; i < strs.length; i++) {

            String current = strs[i];

            int j = 0;

            for (; j < current.length(); j++) {

                if (current.charAt(j) != first.charAt(j)) {
                    break;
                }

            }

            common = Math.min(common, j);

        }

        return first.substring(0, common);
    }
}
