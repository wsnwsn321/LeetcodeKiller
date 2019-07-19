package src.com.company;

public class Solution203_RemoveLinkedListElements {
      public class ListNode {
          int val;
            ListNode next;
          ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
          ListNode dumb = new ListNode(0);
          dumb.next = head;
          ListNode current = dumb;
          while(current!=null&&current.next!=null){
              if (current.next.val==val){
                  current.next = current.next.next;
              }
              else current = current.next;
          }
          return dumb.next;
    }
}
