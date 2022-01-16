package com.mchekin.leetcodesolutions.twosum.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void twoSum() {
        assertArrayEquals(
                new int[]{0, 1},
                new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)
        );

        assertArrayEquals(
                new int[]{1, 2},
                new Solution().twoSum(new int[]{3, 2, 4}, 6)
        );

        assertArrayEquals(
                new int[]{0, 1},
                new Solution().twoSum(new int[]{3, 3}, 6)
        );
    }
}