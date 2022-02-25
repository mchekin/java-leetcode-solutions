package com.mchekin.leetcodesolutions.removeelement.twopointers1;

/**
 * Problem: <a href="https://leetcode.com/problems/remove-element/">Remove Element</a>
 *
 * <p>
 * Time Complexity: O(n) (where n is the number of numbers in the array)
 * Space Complexity: O(1)
 */
public class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
