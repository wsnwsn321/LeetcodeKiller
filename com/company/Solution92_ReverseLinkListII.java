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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre =dummy;
        for (int i = 1; i < m ; ++i) {
            pre =cur;
            cur = cur.next;
        }
        //save the node before the reverse begin
        ListNode preReverseNode = pre;
        ListNode reverseStart = cur;
        for(int i =m;i<=n;++i){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        reverseStart.next = cur;
        preReverseNode.next = pre;
        return dummy.next;

    }

}
