package com.mchekin.leetcodesolutions.twosum.bruteforce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test() {
        assertArrayEquals(
                new int[]{0, 1},
                new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)
        );

        assertArrayEquals(
                new int[]{1,2},
                new Solution().twoSum(new int[]{3, 2, 4}, 6)
        );

        assertArrayEquals(
                new int[]{0, 1},
                new Solution().twoSum(new int[]{3,3}, 6)
        );
    }
}