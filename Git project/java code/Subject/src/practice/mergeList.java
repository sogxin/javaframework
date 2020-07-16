package practice;

import java.util.Scanner;

public class mergeList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入链表1元素数目： ");
        int m = input.nextInt();
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i = 0; i < m; i++) {
            cur.next = new ListNode();
            cur = cur.next;
            cur.val = input.nextInt();
        }
        System.out.print("请输入链表2元素数目： ");
        int n = input.nextInt();
        ListNode head1 = new ListNode();
        cur = head1;
        for (int i = 0; i < n; i++) {
            cur.next = new ListNode();
            cur = cur.next;
            cur.val = input.nextInt();
        }
        mergeList t = new mergeList();
        ListNode l3= t.mergeTwoLists(head.next, head1.next);

        while(l3 != null) {
            System.out.print(l3.val+" ");
            l3 = l3.next;
        }
    }
}
