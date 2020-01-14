package com.company;

import java.util.*;

public class Solution82_RemoveDupFromList2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {


    }
    //time:     O(n)
    //space:    O(1)
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = head, pre = dummyHead;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next != cur)
                pre.next = cur.next;
            else
                pre = cur;
            cur = cur.next;
        }
        return dummyHead.next;
    }

}
