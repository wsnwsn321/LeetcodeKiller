package com.company;

public class Solution92_ReverseLinkListII {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode pre = dummyhead,cur = head;
        for (int i=1;i<m;++i){
            pre = cur;
            cur = cur.next;
        }
        //cur is now head of reverse,pre is going to connect to reversed head
        ListNode preReversed = pre;
        ListNode reversedTail = cur;
        for (int i=m;i<n;++i){
            ListNode temp = cur.next;
            cur.next = pre;
            pre =cur;
            cur = temp;
        }
        preReversed.next = pre;
        reversedTail.next = cur;
        return dummyhead.next;
    }

}
