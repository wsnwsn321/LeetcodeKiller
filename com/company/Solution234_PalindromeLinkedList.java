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
        ListNode slow=head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow =slow.next;
        }
        if (fast!=null) slow=slow.next;
        slow = reverse(slow);
        while (slow!=null){
            if (slow.val!=head.val)return false;
            slow =slow.next;
            head =head.next;
        }
        return true;


    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
