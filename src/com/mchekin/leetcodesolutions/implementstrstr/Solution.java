package com.mchekin.leetcodesolutions.implementstrstr;

/**
 * Problem: <a href="https://leetcode.com/problems/implement-strstr/">Implement strStr</a>
 *
 * <p>
 * Time Complexity: O(n*m) (where n is the size of haystack and m is the size of needle)
 * Space Complexity: O(1)
 */
public class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }


        return -1;
    }
}
