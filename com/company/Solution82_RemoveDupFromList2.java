package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution82_RemoveDupFromList2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(1)
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(0);
        boolean duped=false;
        pre.next = head;
        ListNode dummyHead = pre;
        ListNode cur = head;
        while (cur!=null){
            while (cur.next!=null&&cur.val==cur.next.val){
                cur = cur.next;
            }
            //if there's no duplication, ignore no node
            if (pre.next==cur) pre = cur;
            //step over all duplicated nodes
            else pre.next =cur.next;
            cur = cur.next;
        }
        return dummyHead.next;
    }

}
