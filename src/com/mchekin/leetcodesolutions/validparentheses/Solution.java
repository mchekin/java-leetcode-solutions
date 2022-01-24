package com.mchekin.leetcodesolutions.validparentheses;

import java.util.Stack;

/**
 * Problem: <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 *
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if ("({[".indexOf(currentChar) != -1) {
                openBrackets.push(currentChar);
            } else {

                if (openBrackets.empty()) {
                    return false;
                }

                char lastOpenBracket = openBrackets.pop();

                if (lastOpenBracket == '(' && currentChar != ')'
                        || lastOpenBracket == '{' && currentChar != '}'
                        || lastOpenBracket == '[' && currentChar != ']') {

                    return false;
                }
            }
        }

        return openBrackets.empty();
    }
}