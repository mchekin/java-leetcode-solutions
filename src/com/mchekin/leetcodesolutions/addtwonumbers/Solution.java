package com.mchekin.leetcodesolutions.addtwonumbers;

/**
 * Problem: <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 *
 * <pre>
 *      Time Complexity: O(max(n,m))
 *      Space Complexity: O(max(n,m))
 * </pre>
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;

        int carry = 0;

        while (l1 != null || l2 != null) {

            int operand1 = l1 != null ? l1.val : 0;
            int operand2 = l2 != null ? l2.val : 0;

            int rawResult = operand1 + operand2 + carry;

            int currentValue = rawResult % 10;
            carry = rawResult / 10;

            currentNode.next = new ListNode(currentValue);
            currentNode = currentNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }

        return result.next;
    }
}
