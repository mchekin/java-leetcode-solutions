package com.mchekin.leetcodesolutions.palindromenumber;

/**
 * Problem: <a href="https://leetcode.com/problems/palindrome-number/">Add Two Numbers</a>
 *
 * <p>
 * Time Complexity: O(n) (where n is the number of digits)
 * Space Complexity: O(1)
 */
public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedX = 0;
        while (x > reversedX) {
            reversedX = reversedX * 10 + x % 10;
            x = x / 10;
        }

        return x == reversedX || x == reversedX / 10;
    }
}
