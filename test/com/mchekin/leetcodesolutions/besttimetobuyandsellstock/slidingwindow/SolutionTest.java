package com.mchekin.leetcodesolutions.besttimetobuyandsellstock.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void removesDuplicates(int[] input, int expected) {

        Assertions.assertEquals(expected, new Solution().maxProfit(input));
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        null,
                        0
                ),
                Arguments.of(
                        new int[]{},
                        0
                ),
                Arguments.of(
                        new int[]{7},
                        0
                ),
                Arguments.of(
                        new int[]{1, 7},
                        6
                ),
                Arguments.of(
                        new int[]{7, 1},
                        0
                ),
                Arguments.of(
                        new int[]{7,1,5,3,6,4},
                        5
                ),
                Arguments.of(
                        new int[]{7,6,4,3,1},
                        0
                ),
                Arguments.of(
                        new int[]{2,1,2,1,0,1,2},
                        2
                )
        );
    }
}