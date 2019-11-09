package com.company.CompanyList.Broadway;

public class DesignHashMap {
    public static void main(String[] args) {

    }

    class MyHashMap {
        class ListNode {
            int key, val;
            ListNode next;

            ListNode(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
        private static final double LOAD_FACTOR = 0.75;
        int size=0;
        ListNode[] nodes = new ListNode[10000];
        /** Initialize your data structure here. */
        public MyHashMap() {

        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int hashCode = key%nodes.length;
            if (nodes[hashCode]==null)
                nodes[hashCode] = new ListNode(-1,-1);
            ListNode pre = findPrev(key);
            if (pre.next==null){
                pre.next = new ListNode(key,value);
                size++;
            }
            else
                pre.next.val = value;

            if (size/nodes.length>LOAD_FACTOR){
                rehash();
            }
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int hashCode = key%nodes.length;
            if (nodes[hashCode]==null) return -1;
            ListNode pre = findPrev(key);
            return pre.next==null?-1:pre.next.val;
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int hashCode = key%nodes.length;
            if (nodes[hashCode]==null) return;
            ListNode pre = findPrev(key);
            pre.next = pre.next.next;
            size--;
        }
        public ListNode findPrev(int key){
            int hashCode = key%nodes.length;
            ListNode cur = nodes[hashCode], pre = null;
            while (cur!=null&&cur.key!=key){
                pre = cur;
                cur = cur.next;
            }
            return pre;
        }

        //rehash
        private void rehash() {
            ListNode[] tmp = nodes;
            nodes = new ListNode[tmp.length * 2];
            size = 0;
            for (ListNode head:tmp){
                for (ListNode cur = head;cur!=null;cur = cur.next){
                    put(cur.key,cur.val);
                }
            }

        }

    }


}
