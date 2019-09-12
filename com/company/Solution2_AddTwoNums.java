package com.company;

import java.util.List;

public class Solution2_AddTwoNums {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    //runtime: O(max(len(l1),len(l2)))
    //space: O(max(len(l1),len(l2)))
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead =new ListNode(0);
        ListNode head  = dummyHead;
        int over = 0;
        int sum=0;
        while (l1!=null||l2!=null){
            int n1 = l1==null?0:l1.val;
            int n2 = l2==null?0:l2.val;
            sum = (n1+n2+over)%10;
            over = (n1+n2+over)/10;
            head.next = new ListNode(sum);
            head =head.next;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        if (over==1) head.next=new ListNode(1);
        return dummyHead.next;
    }
}
