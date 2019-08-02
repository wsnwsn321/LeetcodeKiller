public class Solution328_OddEvenLinkedList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    public static void main(String[] args) {

    }
    public ListNode oddEvenList(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode cur = head;
        ListNode evenHead = head.next;
        ListNode evenNode = evenHead;
        while(evenNode!=null&&evenNode.next!=null){
            System.out.println(evenNode.val);
            cur.next = evenNode.next;
            cur = cur.next;
            evenNode.next = cur.next;
            evenNode=evenNode.next;
        }
        cur.next =evenHead;
        return head;
    }
}
