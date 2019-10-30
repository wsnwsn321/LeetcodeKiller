package com.company;

public class Solution148_SortList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public ListNode sortList(ListNode head) {
        ListNode slow = head, fast = head,pre =null;
        while (fast!=null&&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1,l2);

    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummyhead = new ListNode(0),head = dummyhead;
        while (l1!=null||l2!=null){
            int v1 = l1==null?Integer.MAX_VALUE:l1.val;
            int v2 = l2==null?Integer.MAX_VALUE:l2.val;
            if (v1<v2){
                head.next = l1;
                l1 =l1.next;
            }
            else {
                head.next=l2;
                l2=l2.next;
            }
            head = head.next;
        }
        return dummyhead.next;
    }
}
