package com.company;

import java.util.*;

public class Solution138_R {
    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {
        }

        public Node(int _val, Node _next, Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    Map<Node,Node> m = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if(m.containsKey(head)){
            return m.get(head);
        }
        Node node = new Node(head.val,null,null);
        m.put(head,node);
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        return node;
    }
}
