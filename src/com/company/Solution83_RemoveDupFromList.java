package com.company;


public class Solution83_RemoveDupFromList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp =head;
        while(temp!=null){
            if(temp.next!=null&&temp.val==temp.next.val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
