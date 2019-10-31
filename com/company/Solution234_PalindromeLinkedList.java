package com.company;

public class Solution234_PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow =head,fast = head,pre =null;
        while (fast!=null&&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode second = reverseList(fast);
        return head.equals(second);
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre =cur;
            cur= temp;
        }
        return pre;
    }
}
