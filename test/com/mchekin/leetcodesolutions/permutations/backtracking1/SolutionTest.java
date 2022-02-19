package com.mchekin.leetcodesolutions.permutations.backtracking1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void permutations(int[] numbers, List<List<Integer>> expected) {

        assertEquals(expected, new Solution().permute(numbers));

    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        null,
                        new ArrayList<List<Integer>>()
                ),
                Arguments.of(
                        new int[]{},
                        new ArrayList<List<Integer>>() {
                            {
                                add(new ArrayList<>());
                            }
                        }
                ),
                Arguments.of(
                        new int[]{1},
                        new ArrayList<>() {
                            {
                                add(new ArrayList<>() {
                                    {
                                        add(1);
                                    }
                                });
                            }
                        }
                ),
                Arguments.of(
                        new int[]{1, 2},
                        new ArrayList<>() {
                            {
                                add(Arrays.asList(1, 2));
                                add(Arrays.asList(2, 1));
                            }
                        }
                ),
                Arguments.of(
                        new int[]{1, 2, 3},
                        new ArrayList<>() {
                            {
                                add(Arrays.asList(1, 2, 3));
                                add(Arrays.asList(1, 3, 2));
                                add(Arrays.asList(2, 1, 3));
                                add(Arrays.asList(2, 3, 1));
                                add(Arrays.asList(3, 2, 1));
                                add(Arrays.asList(3, 1, 2));
                            }
                        }
                )
        );
    }
}