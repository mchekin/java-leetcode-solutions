package com.mchekin.leetcodesolutions.twosum.naive;

/**
 * Problem: <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 *
 * <p>
 * Solution: Naive
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
