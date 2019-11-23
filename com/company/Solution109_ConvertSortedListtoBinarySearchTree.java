package com.company;

public class Solution109_ConvertSortedListtoBinarySearchTree {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode pre = null, slow = head,fast = head;
        while (fast!=null&&fast.next!=null){
            pre =slow;
            slow= slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
