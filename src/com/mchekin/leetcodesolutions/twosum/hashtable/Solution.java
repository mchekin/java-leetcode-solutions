package com.mchekin.leetcodesolutions.twosum.hashtable;

import java.util.HashMap;

/**
 * Problem: <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 *
 * <p>
 * Solution: Hashmap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> alreadySeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer missingNumber = target - nums[i];

            if (alreadySeen.containsKey(missingNumber)) {
                return new int[]{alreadySeen.get(missingNumber), i};
            }

            alreadySeen.put(nums[i], i);
        }

        return null;
    }
}
