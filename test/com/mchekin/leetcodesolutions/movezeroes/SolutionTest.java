package com.mchekin.leetcodesolutions.movezeroes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void removeElement(int[] numbers, int[] expectedNumbers) {

        new Solution().moveZeroes(numbers);

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(expectedNumbers[i], numbers[i]);
        }
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        new int[0],
                        new int[0]
                ),
                Arguments.of(
                        new int[]{1, 0},
                        new int[]{1, 0}
                ),
                Arguments.of(
                        new int[]{0, 1},
                        new int[]{1, 0}
                ),
                Arguments.of(
                        new int[]{0, 2, 1},
                        new int[]{2, 1, 0}
                ),
                Arguments.of(
                        new int[]{0, 1, 0, 3, 12},
                        new int[]{1, 3, 12, 0, 0}
                ),
                Arguments.of(
                        new int[]{0, 0, 1, 0, 0, 3, 12},
                        new int[]{1, 3, 12, 0, 0, 0, 0}
                )
        );
    }
}