package com.mchekin.leetcodesolutions.removeelement.twopointers1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void removeElement(int[] numbers, int value, int[] expectedNumbers) {

        int actualLength = new Solution().removeElement(numbers, value);

        assertEquals(expectedNumbers.length, actualLength);

        Arrays.sort(numbers, 0, actualLength);

        for (int i = 0; i < actualLength; i++) {
            assertEquals(expectedNumbers[i], numbers[i]);
        }
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        new int[0],
                        0,
                        new int[0]
                ),
                Arguments.of(
                        new int[]{1, 2},
                        2,
                        new int[]{1}
                ),
                Arguments.of(
                        new int[]{1, 2},
                        1,
                        new int[]{2}
                ),
                Arguments.of(
                        new int[]{3, 2, 2, 3},
                        3,
                        new int[]{2, 2}
                ),
                Arguments.of(
                        new int[]{2, 2, 3},
                        2,
                        new int[]{3}
                ),
                Arguments.of(
                        new int[]{0, 1, 2, 2, 3, 0, 4, 2},
                        2,
                        new int[]{0, 0, 1, 3, 4}
                )
        );
    }
}