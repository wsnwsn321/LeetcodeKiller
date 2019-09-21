package com.company;


public class Solution83_RemoveDupFromList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur!=null){
            if (cur.next!=null&&cur.val==cur.next.val){
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return head;
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next =head;
//        ListNode pre = dummyHead;
//        ListNode cur = head;
//        while (cur!=null){
//            pre=cur;
//            while (cur.next!=null&&cur.val==cur.next.val){
//                cur=cur.next;
//            }
//            pre.next = cur.next;
//            cur = cur.next;
//        }
//        return dummyHead.next;
    }
}
