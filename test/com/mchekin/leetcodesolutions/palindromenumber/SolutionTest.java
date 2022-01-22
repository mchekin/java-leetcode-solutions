package com.mchekin.leetcodesolutions.palindromenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideTrueExamples")
    public void isPalindrome(int number) {

        assertTrue(new Solution().isPalindrome(number));
    }

    @ParameterizedTest
    @MethodSource("provideFalseExamples")
    public void isNotPalindrome(int number) {

        assertFalse(new Solution().isPalindrome(number));
    }

    public static Stream<Arguments> provideTrueExamples() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(1),
                Arguments.of(121),
                Arguments.of(1221)
        );
    }

    public static Stream<Arguments> provideFalseExamples() {
        return Stream.of(
                Arguments.of(-1),
                Arguments.of(10),
                Arguments.of(1234)
        );
    }
}