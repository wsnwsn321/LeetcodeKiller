package com.company;

public class Solution876 {
    public static void main(String[] args) {

    }


     // Definition for singly-linked list.
        public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

        public ListNode middleNode(ListNode head) {
            ListNode original = head;
            int length = 1;
            while (head.next!=null){
                length++;
                head = head.next;
            }
            int mid  =length/2+1;
            int count =1;
            while (count<mid){
                original = original.next;
                count++;
            }
            return original;
        }
}
