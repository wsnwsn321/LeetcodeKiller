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
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> m = new HashMap<>();
        int i=0;
        while(headA!=null){
            m.put(headA,headA.val);
            headA=headA.next;
        }
        while(headB!=null){
            if(m.containsKey(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
