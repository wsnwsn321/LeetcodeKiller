package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution160_IntersectForLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a!=b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
        }
        return a;
    }
}
