package com.company;

public class Solution1290_ConvertBinaryNumberinaLinkedListtoInteger {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {

    }
    public static int getDecimalValue(ListNode head) {
        int num = 0;
        while(head!=null) {
            num <<= 1;
            num += head.val;
            head = head.next;
        }
        return num;
    }
}
