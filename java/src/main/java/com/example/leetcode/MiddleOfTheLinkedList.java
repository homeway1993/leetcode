package com.example.leetcode;


public class MiddleOfTheLinkedList {

    ListNode middleNode(ListNode head) {
        int target = getDepth(head) / 2;
        return getTarget(head, target);
    }

    private ListNode getTarget(ListNode node, int target) {
        return getTarget(node, target, 1);
    }

    private ListNode getTarget(ListNode node, int target, int current) {
        if (current > target) {
            return node;
        }

        return getTarget(node.next, target, ++current);
    }

    private int getDepth(ListNode node) {
        return getDepth(node, 1);
    }

    private int getDepth(ListNode node, int depth) {
        if (node.next == null) {
            return depth;
        }

        return getDepth(node.next, ++depth);
    }

    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
