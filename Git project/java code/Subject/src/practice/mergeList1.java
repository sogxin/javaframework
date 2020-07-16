package practice;

import java.util.Scanner;

public class mergeList1 {
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
        int[] a = new int[m];
        insertdata it = new insertdata();
        ListNode head = new ListNode();
        for (int i = 0; i < m; i++) {
            a[i]=input.nextInt();
            head = it.addNode(head, a[i]);
        }
        System.out.print("请输入链表2元素数目： ");
        int n = input.nextInt();
        int[] b = new int[n];
        ListNode head1 = new ListNode();
        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
            head1 = it.addNode(head1, b[i]);
        }
        mergeList1 t = new mergeList1();
        ListNode l3= t.mergeTwoLists(head.next, head1.next);
        while(l3 != null) {
            System.out.print(l3.val+" ");
            l3 = l3.next;
        }
    }
}
