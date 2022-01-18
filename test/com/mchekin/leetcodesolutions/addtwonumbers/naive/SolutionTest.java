package com.mchekin.leetcodesolutions.addtwonumbers.naive;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest
    @MethodSource("provideExamples")
    public void addTwoNumbers(ListNode number1, ListNode number2, ListNode expected) {

        ListNode actual = new Solution().addTwoNumbers(number1, number2);

        assertListEquals(expected, actual);
    }

    public static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(
                        null,
                        null,
                        null
                ),
                Arguments.of(
                        null,
                        new ListNode(3),
                        new ListNode(3)
                ),
                Arguments.of(
                        new ListNode(0),
                        new ListNode(0),
                        new ListNode(0)
                ),
                Arguments.of(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4))),
                        new ListNode(7, new ListNode(0, new ListNode(8)))
                ),
                Arguments.of(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(5)))),
                        new ListNode(7, new ListNode(0, new ListNode(8, new ListNode(5))))
                ),
                Arguments.of(
                        new ListNode(2, new ListNode(4, new ListNode(5))),
                        new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(5)))),
                        new ListNode(7, new ListNode(0, new ListNode(0, new ListNode(6))))
                ),
                Arguments.of(
                        new ListNode(9, new ListNode(9, new ListNode(9))),
                        new ListNode(9, new ListNode(9, new ListNode(9))),
                        new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(1))))
                )
        );
    }

    private void assertListEquals(ListNode expected, ListNode actual) {
        ListNode currentExpected = expected;
        ListNode currentActual = actual;

        while (currentExpected != null && currentActual != null) {
            assertEquals(currentExpected.val, currentActual.val);

            currentExpected = currentExpected.next;
            currentActual = currentActual.next;
        }

        assertTrue(currentExpected == null && currentActual == null);
    }
}