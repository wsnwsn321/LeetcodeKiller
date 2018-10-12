package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution206 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        List<Integer> l = new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head = head.next;
        }
        ListNode temp = new ListNode(l.get(l.size()-1));
        ListNode result = temp;
        for(int i=l.size()-1;i>-1;--i){
            ListNode next = new ListNode(l.get(i));
            temp.next=next;
            temp = temp.next;
        }
        return result;

    }
}
