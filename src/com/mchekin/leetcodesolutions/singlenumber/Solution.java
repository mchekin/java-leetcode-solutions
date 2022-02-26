package com.mchekin.leetcodesolutions.singlenumber;

/**
 * Problem: <a href="https://leetcode.com/problems/single-number/">Single Number</a>
 *
 * <p>
 * Time Complexity: O(n) (where n is the number of numbers in the array)
 * Space Complexity: O(1)
 */
public class Solution {
    public int singleNumber(int[] nums) {

        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result = nums[i] ^ result;
        }

        return result;
    }
}
