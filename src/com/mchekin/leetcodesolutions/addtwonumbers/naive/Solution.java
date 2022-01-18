package com.mchekin.leetcodesolutions.addtwonumbers.naive;

/**
 * Problem: <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int rawResult = l1.val + l2.val;

        int currentValue = rawResult % 10;
        int carry = rawResult / 10;

        ListNode result = new ListNode(currentValue);
        ListNode currentNode = result;

        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;

            rawResult = l1.val + l2.val + carry;

            currentValue = rawResult % 10;
            carry = rawResult / 10;

            currentNode.next = new ListNode(currentValue);
            currentNode = currentNode.next;
        }

        currentNode.next = l1.next != null ? l1.next : l2.next;

        return result;
    }
}
