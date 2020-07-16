package practice;

public class insertdata {
    public ListNode addNode(ListNode head, int d) {
        ListNode cur = head;
        ListNode N = new ListNode(d);
        while (cur.next != null) {
              cur = cur.next;
        }
          cur.next = N;
          return head;
    }
}
