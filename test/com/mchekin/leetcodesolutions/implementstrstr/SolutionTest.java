package com.mchekin.leetcodesolutions.implementstrstr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void strStr(String haystack, String needle, int expected) {

        assertEquals(expected, new Solution().strStr(haystack, needle));
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        "",
                        "",
                        0
                ),
                Arguments.of(
                        "hello",
                        "",
                        0
                ),
                Arguments.of(
                        "",
                        "hello",
                        -1
                ),
                Arguments.of(
                        "hello",
                        "he",
                        0
                ),
                Arguments.of(
                        "hello",
                        "ll",
                        2
                ),
                Arguments.of(
                        "mississippi",
                        "issip",
                        4
                ),
                Arguments.of(
                        "aaaa",
                        "bba",
                        -1
                )
        );
    }
}