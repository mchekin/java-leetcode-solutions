package com.mchekin.leetcodesolutions.validparentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideTrueExamples")
    public void isValid(String string) {

        assertTrue(new Solution().isValid(string));
    }

    @ParameterizedTest
    @MethodSource("provideFalseExamples")
    public void isNotValid(String string) {

        assertFalse(new Solution().isValid(string));
    }

    public static Stream<Arguments> provideTrueExamples() {
        return Stream.of(
                Arguments.of("()"),
                Arguments.of("()[]{}"),
                Arguments.of("(({[]})){[]}()")
        );
    }

    public static Stream<Arguments> provideFalseExamples() {
        return Stream.of(
                Arguments.of("("),
                Arguments.of("]"),
                Arguments.of("(]"),
                Arguments.of("({)"),
                Arguments.of("([]")
        );
    }
}