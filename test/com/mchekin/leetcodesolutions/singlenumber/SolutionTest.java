package com.mchekin.leetcodesolutions.singlenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void removeElement(int[] numbers, int expected) {

        int actual = new Solution().singleNumber(numbers);

        assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        new int[]{1},
                        1
                ),
                Arguments.of(
                        new int[]{1, 0, 0},
                        1
                ),
                Arguments.of(
                        new int[]{2,2,1},
                        1
                ),
                Arguments.of(
                        new int[]{1,2,1},
                        2
                ),
                Arguments.of(
                        new int[]{4,1,2,1,2},
                        4
                )
        );
    }
}