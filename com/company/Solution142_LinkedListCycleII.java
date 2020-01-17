package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution142_LinkedListCycleII {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode intersect = findIntersection(head);
        if (intersect == null) return null;
        ListNode p1 = head;
        ListNode p2 = intersect;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public ListNode findIntersection(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != fast && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == fast)
            return slow;
        else
            return null;
    }
}
