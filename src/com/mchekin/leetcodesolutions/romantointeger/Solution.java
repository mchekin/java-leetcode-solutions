package com.mchekin.leetcodesolutions.romantointeger;

/**
 * Problem: <a href="https://leetcode.com/problems/roman-to-integer/">Roman To Integer</a>
 *
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Solution {
    public int romanToInt(String s) {

        int result = 0;
        int currentValue = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 < s.length()) {
                        switch (s.charAt(i + 1)) {
                            case 'V' -> {
                                currentValue = 4;
                                i++;
                            }
                            case 'X' -> {
                                currentValue = 9;
                                i++;
                            }
                            default -> currentValue = 1;
                        }
                    } else {
                        currentValue = 1;
                    }
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    if (i + 1 < s.length()) {
                        switch (s.charAt(i + 1)) {
                            case 'L' -> {
                                currentValue = 40;
                                i++;
                            }
                            case 'C' -> {
                                currentValue = 90;
                                i++;
                            }
                            default -> currentValue = 10;
                        }
                    } else {
                        currentValue = 10;
                    }
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    if (i + 1 < s.length()) {
                        switch (s.charAt(i + 1)) {
                            case 'D' -> {
                                currentValue = 400;
                                i++;
                            }
                            case 'M' -> {
                                currentValue = 900;
                                i++;
                            }
                            default -> currentValue = 100;
                        }
                    } else {
                        currentValue = 100;
                    }
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }

            result += currentValue;
        }

        return result;
    }
}
