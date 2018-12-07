package com.company;

public class Solution2_AddTwoNums_R {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        int carry=0;
        while(l1!=null&&l2!=null){
            int sum = l1.val + l2.val + carry ;
            int net = sum % 10;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            temp.next = new ListNode(net);
            temp = temp.next;
        }
        while(l1!=null){
            int sum = l1.val+carry;
            int net = sum%10;
            carry = sum/10;
            temp.next = new ListNode(net);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int sum = l2.val+carry;
            int net = sum%10;
            carry = sum/10;
            temp.next = new ListNode(net);
            temp = temp.next;
            l2 = l2.next;
        }
        if(carry==1) temp.next = new ListNode(1);
        return result.next;

    }
}
