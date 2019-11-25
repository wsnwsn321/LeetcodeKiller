package com.company;

import java.util.Stack;

public class Solution445_AddTwoNumbersII {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> n1 = new Stack<>();
        Stack<Integer> n2 = new Stack<>();
        while (l1!=null){
            n1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            n2.push(l2.val);
            l2=l2.next;
        }
        ListNode temp = new ListNode(0);
        int carry=0;
        while (n1.size()>0||n2.size()>0){
            int i1 = n1.size()>0?n1.pop():0;
            int i2 = n2.size()>0?n2.pop():0;
            int sum = i1+i2+carry;
            carry = sum/10;
            temp.val = sum%10;
            ListNode head = new ListNode(carry);
            head.next = temp;
            temp = head;
        }
        return temp.val==0?temp.next:temp;
    }

}
