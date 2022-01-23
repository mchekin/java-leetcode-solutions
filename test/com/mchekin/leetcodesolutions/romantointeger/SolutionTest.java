package com.mchekin.leetcodesolutions.romantointeger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void romanToInt(String roman, int expected) {

        assertEquals(expected, new Solution().romanToInt(roman));
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        "I",
                        1
                ),
                Arguments.of(
                        "V",
                        5
                ),
                Arguments.of(
                        "X",
                        10
                ),
                Arguments.of(
                        "L",
                        50
                ),
                Arguments.of(
                        "C",
                        100
                ),
                Arguments.of(
                        "D",
                        500
                ),
                Arguments.of(
                        "M",
                        1000
                ),
                Arguments.of(
                        "II",
                        2
                ),
                Arguments.of(
                        "III",
                        3
                ),
                Arguments.of(
                        "IV",
                        4
                ),
                Arguments.of(
                        "IX",
                        9
                ),
                Arguments.of(
                        "XL",
                        40
                ),
                Arguments.of(
                        "XC",
                        90
                ),
                Arguments.of(
                        "CD",
                        400
                ),
                Arguments.of(
                        "CM",
                        900
                ),
                Arguments.of(
                        "LVIII",
                        58
                ),
                Arguments.of(
                        "MCMXCIV",
                        1994
                )
        );
    }
}