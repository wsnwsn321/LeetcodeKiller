package com.company;

public class Solution143_ReorderList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode prev = null, slow = head, fast = head, l1 = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode head2 = reverse(slow);
        while (head2 != null) {
            ListNode temp = head.next;
            head.next = head2;
            head = head2;
            head2 = temp;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode pre =null, cur = head;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
