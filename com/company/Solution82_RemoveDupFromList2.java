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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre =dummy,cur = head;
        while (cur!=null){
            while (cur.next!=null&&cur.val==cur.next.val){
                cur = cur.next;
            }
            //no dup found
            if (pre.next==cur){
                pre = cur;
            }
            else
                pre.next = cur.next;
            cur = cur.next;
        }
        return dummy.next;
    }

}
