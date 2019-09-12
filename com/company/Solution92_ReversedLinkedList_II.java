package com.company;

public class Solution92_ReversedLinkedList_II {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        int count =1;
        ListNode ogHead =head;
        ListNode reverseHead = null;
        while(count<n){
            if(count==m) reverseHead = head;
            head =head.next;
            count++;
        }
        ListNode tail = head;

        return reverseList(reverseHead,tail);
        //return ogHead;


    }

    public static ListNode reverseList(ListNode head,ListNode tail) {
        ListNode pre =tail;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }

}
