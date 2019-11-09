package com.company.CompanyList.Broadway;

public class InsertintoaCyclicSortedDoublyList {
    static class Node {
        public int val;
        public Node next;
        public Node prev;
        public Node() {}

        public Node(int _val,Node _next,Node _prev) {
            val = _val;
            next = _next;
            prev = _prev;
        }
    }
    public static void main(String[] args) {
        Node head = new Node();
        head.val =1;
        head.next =null;
        head.prev  = null;
        Node res = insert2(null,2);
    }
    //runtime:  O(n)
    public static Node insert(Node head, int insertVal) {
        if (head==null){
            return new Node(insertVal,null,null);
        }
        Node cur = head;
        while (cur!=head){
            //break case 1: insertval = cur.value, add after cur
            //break case 2: insertval in middle of cur and cur.next
            //break case 3: insertval bigger than all nums in list
            //break case 4: insertval smaller than all nums in list
            if (cur.val == insertVal || (cur.val < insertVal && cur.next.val > insertVal) ||
                    (cur.prev.val < insertVal && cur.prev.val > cur.val) ||
                    (cur.val > insertVal && cur.prev.val > cur.val)

            ) break;
            cur = cur.next;
        }
        Node ogNext = cur.next;
        cur.next = new Node(insertVal,ogNext,cur);
        return head;

    }

    public static Node insert2(Node head, int insertVal){
        if (head==null) return new Node(insertVal,null,null);
        Node cur = head.next;
        while (cur!=head){
            //insert value==pre.val
            if (cur.prev.val == insertVal ||
                    //insert value in between pre and cur
                    (cur.prev.val < insertVal && cur.val > insertVal) ||
                    //insert value > all elements
                    (cur.prev.val < insertVal && cur.prev.val > cur.val) ||
                    //insert value < all elements
                    (cur.val > insertVal && cur.prev.val > cur.val)
            ) {
                break;
            }
            cur = cur.next;
        }
        Node n = new Node(insertVal,cur,cur.prev);
        cur.prev.next = n;
        cur.prev = n;
        return head;
    }
}
