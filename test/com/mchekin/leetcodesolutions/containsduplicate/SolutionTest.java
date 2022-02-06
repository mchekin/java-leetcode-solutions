package com.mchekin.leetcodesolutions.containsduplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideTrueExamples")
    public void isValid(int[] numbers) {

        assertTrue(new Solution().containsDuplicate(numbers));
    }

    @ParameterizedTest
    @MethodSource("provideFalseExamples")
    public void isNotValid(int[] numbers) {

        assertFalse(new Solution().containsDuplicate(numbers));
    }

    public static Stream<int[]> provideTrueExamples() {
        return Stream.of(
                new int[]{1, 1},
                new int[]{1,2,3,1},
                new int[]{1,1,1,3,3,4,3,2,4,2}
        );
    }

    public static Stream<int[]> provideFalseExamples() {
        return Stream.of(
                null,
                new int[]{},
                new int[]{1},
                new int[]{1,2,3,4}
        );
    }
}