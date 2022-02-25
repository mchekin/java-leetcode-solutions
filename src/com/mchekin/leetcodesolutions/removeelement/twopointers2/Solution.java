package com.mchekin.leetcodesolutions.removeelement.twopointers2;

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
        int length = nums.length;

        while (i < length) {

            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                length--;

                continue;
            }

            i++;
        }

        return length;
    }
}
