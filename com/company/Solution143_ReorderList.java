package com.company;

public class Solution143_ReorderList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next  = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        //reorderList(head);

    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow.next);
        slow.next = null;
        while (second != null) {
            ListNode temp = head.next;
            head.next = second;
            head = second;
            second = temp;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
