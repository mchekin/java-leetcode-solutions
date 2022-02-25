package com.mchekin.leetcodesolutions.removeelement.twopointers2;

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
