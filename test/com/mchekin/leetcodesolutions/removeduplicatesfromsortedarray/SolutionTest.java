package com.mchekin.leetcodesolutions.removeduplicatesfromsortedarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void removesDuplicates(int[] sortedArray, int[] expectedSortedArray, int expectedUniquePlaces) {

        assertEquals(expectedUniquePlaces, new Solution().removeDuplicates(sortedArray));

        if (sortedArray != null) {
            assertArrayEquals(expectedSortedArray, Arrays.copyOf(sortedArray, expectedUniquePlaces));
        }
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        null,
                        null,
                        0
                ),
                Arguments.of(
                        new int[]{1},
                        new int[]{1},
                        1
                ),
                Arguments.of(
                        new int[]{1, 2, 3},
                        new int[]{1, 2, 3},
                        3
                ),
                Arguments.of(
                        new int[]{1, 2, 2},
                        new int[]{1, 2},
                        2
                ),
                Arguments.of(
                        new int[]{1, 1, 2},
                        new int[]{1, 2},
                        2
                ),
                Arguments.of(
                        new int[]{0,0,1,1,1,2,2,3,3,4},
                        new int[]{0, 1, 2, 3, 4},
                        5
                )
        );
    }
}