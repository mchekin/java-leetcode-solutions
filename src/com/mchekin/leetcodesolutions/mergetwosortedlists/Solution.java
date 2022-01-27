package com.mchekin.leetcodesolutions.mergetwosortedlists;

/**
 * Problem: <a href="https://leetcode.com/problems/merge-two-sorted-lists/">Merge Two Sorted Lists</a>
 *
 * <p>
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        ListNode swap;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                swap = l1.next;
                l1.next = null;
                currentNode.next = l1;
                l1 = swap;
            } else {
                swap = l2.next;
                l2.next = null;
                currentNode.next = l2;
                l2 = swap;
            }

            currentNode = currentNode.next;
        }

        if (l1 != null) {
            currentNode.next = l1;
        }

        if (l2 != null) {
            currentNode.next = l2;
        }

        return result.next;
    }
}
