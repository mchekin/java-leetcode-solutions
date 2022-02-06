package com.mchekin.leetcodesolutions.containsduplicate;

import java.util.HashMap;

/**
 * Problem: <a href="https://leetcode.com/problems/contains-duplicate/">Contains Duplicate</a>
 *
 * <p>
 * Time Complexity: O(n) (where n is the number of numbers)
 * Space Complexity: O(1)
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {

        if (nums == null) {
            return false;
        }

        HashMap<Integer, Integer> alreadySeen = new HashMap<>();

        for (int number : nums) {
            if (alreadySeen.containsKey(number)) {
                return true;
            }

            alreadySeen.put(number, 1);
        }

        return false;
    }
}
