package com.example.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfTheLinkedListTest {

    private MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    @Test
    public void test() {
        // prepare
        MiddleOfTheLinkedList.ListNode node1 = new MiddleOfTheLinkedList.ListNode(77);
        MiddleOfTheLinkedList.ListNode node2 = new MiddleOfTheLinkedList.ListNode(96);
        MiddleOfTheLinkedList.ListNode node3 = new MiddleOfTheLinkedList.ListNode(86);
        node1.next = node2;
        node2.next = node3;


        MiddleOfTheLinkedList.ListNode result = solution.middleNode(node1);
        assertEquals(96, result.val);
    }

    @Test
    public void test1() {
        // prepare
        MiddleOfTheLinkedList.ListNode node1 = new MiddleOfTheLinkedList.ListNode(77);
        MiddleOfTheLinkedList.ListNode node2 = new MiddleOfTheLinkedList.ListNode(96);
        MiddleOfTheLinkedList.ListNode node3 = new MiddleOfTheLinkedList.ListNode(86);
        MiddleOfTheLinkedList.ListNode node4 = new MiddleOfTheLinkedList.ListNode(22);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        MiddleOfTheLinkedList.ListNode result = solution.middleNode(node1);
        assertEquals(86, result.val);
    }
}