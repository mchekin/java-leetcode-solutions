package com.mchekin.leetcodesolutions.removeduplicatesfromsortedarray;

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
