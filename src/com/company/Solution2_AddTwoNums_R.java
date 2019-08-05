package com.company;

import java.util.List;

public class Solution2_AddTwoNums_R {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(0);
       ListNode head = dummy;
       int carry=0;
       while(l1!=null&&l2!=null){
           int n1 = (l1==null)?0:l1.val;
           int n2 = (l2==null)?0:l2.val;
           int sum = n1+n2+carry;
           ListNode temp = new ListNode(sum%10);
           carry = sum/10;
           head.next = temp;
           head = head.next;
           l1 = l1.next;
           l2=l2.next;
       }
       return dummy.next;
    }
}
