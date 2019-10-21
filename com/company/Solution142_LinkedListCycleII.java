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
        Set<ListNode> s = new HashSet<>();
        ListNode cur = head;
        while (cur!=null){
            if (s.contains(cur)) return cur;
            s.add(cur);
            cur = cur.next;
        }
        return null;
    }
}
