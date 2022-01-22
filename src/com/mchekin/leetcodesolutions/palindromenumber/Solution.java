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
        while (x > reversedX) { // 1221 > 0; 122 > 1
            reversedX = reversedX * 10 + x % 10; // 0 * 10 + 1221 % 10 = 1; 1 * 10 + 122 % 10 = 12;
            x = x / 10; // 1221 / 10 = 122; 122 / 10 = 12;
        }

        return x == reversedX || x == reversedX / 10; // 12 == 12 || 12 == 12 / 10;
    }
}
