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
        dummy.next =head;
        ListNode cur = head;
        ListNode pre = dummy;
        while (cur!=null){
            while (cur.next!=null&&cur.val==cur.next.val){
                cur =cur.next;
            }
            if (pre.next!=cur){
                pre.next = cur.next;
            }
            else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

}
