package com.mchekin.leetcodesolutions.longestcommonprefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void romanToInt(String[] input, String expected) {

        assertEquals(expected, new Solution().longestCommonPrefix(input));
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        new String[]{},
                        ""
                ),
                Arguments.of(
                        new String[]{""},
                        ""
                ),
                Arguments.of(
                        new String[]{"ab", "a"},
                        "a"
                ),
                Arguments.of(
                        new String[]{"dog","racecar","car"},
                        ""
                ),
                Arguments.of(
                        new String[]{"flower","flow","flight"},
                        "fl"
                )
        );
    }
}