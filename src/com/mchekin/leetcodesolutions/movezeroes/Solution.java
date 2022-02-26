package com.mchekin.leetcodesolutions.movezeroes;

/**
 * Problem: <a href="https://leetcode.com/problems/move-zeroes/">Move Zeroes</a>
 *
 * <p>
 * Time Complexity: O(n) (where n is the number of numbers in the array)
 * Space Complexity: O(1)
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i=0; i< nums.length; i++) {
            if (nums[i] != 0) {
                int swap = nums[j];
                nums[j] = nums[i];
                nums[i] = swap;

                j++;
            }
        }
    }
}
