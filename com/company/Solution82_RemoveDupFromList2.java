package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution82_RemoveDupFromList2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> s = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            if(s.contains(temp.val)){
                s.remove(temp.val);
                while(temp.next!=null&&temp.val == temp.next.val){
                    temp = temp.next;
                }
            }
            else{
                s.add(temp.val);
            }
            temp = temp.next;
        }
        //System.out.println(s);
        ListNode dumb = new ListNode(0);
        ListNode h =dumb;
        for(int x:s){
            h.next = new ListNode(x);
            h = h.next;
        }
        return dumb.next;
    }

}
