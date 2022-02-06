package com.mchekin.leetcodesolutions.removeduplicatesfromsortedarray;

/**
 * Problem: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove Duplicates from Sorted Array</a>
 *
 * <p>
 * Time Complexity: O(n) (where n is the number of numbers in the array)
 * Space Complexity: O(1)
 */
public class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int leftIndex = 1;
        int rightIndex = 1;

        while(rightIndex < nums.length) {

            if (nums[rightIndex-1] != nums[rightIndex]) {
                nums[leftIndex] = nums[rightIndex];
                leftIndex++;
            }

            rightIndex++;
        }

        return leftIndex;
    }
}
