package com.company.Google;

public class FlattenLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode child;
    }
    public static void main(String[] args) {

    }
    public ListNode solution(ListNode head){
        if (head==null) return null;
        ListNode cur = head;
        while (cur!=null){
            if (cur.child!=null){
                ListNode childHead = solution(cur.child);
                ListNode ogNext = cur.next;
                cur.next = childHead;
                while (childHead!=null){
                    childHead = childHead.next;
                }
                if (ogNext!=null)
                    childHead.next = ogNext;
            }
            cur = cur.next;
        }
        return head;
    }
}
