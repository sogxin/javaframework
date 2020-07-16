package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Twonumbersum1 {
    public class NodeList {
        int val;
        NodeList next;
        public NodeList() {

        }
        public NodeList(int val) {
            this.val = val;
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入target值： ");
        int target = input.nextInt();
        System.out.print("请输入数组值数目： ");
        int n = input.nextInt();
        int[] nums = new int[n];
        System.out.print("请输入数组值： ");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Twonumbersum1 ss= new Twonumbersum1();
        NodeList ter = ss.twosum(nums, target);
        if(ter == null) {
            System.out.println(' ');
        }
        else  {
            while(ter.next != null) {
                System.out.print(ter.val+" ");
                ter = ter.next;
            }
        }
    }
    public NodeList twosum(int[] nums, int target) {
        NodeList cur= new NodeList( );
        NodeList head= cur;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                cur.val = map.get(value);
                cur.next = new NodeList();
                cur = cur.next;
                cur.val = i;
                cur.next = new NodeList();
                cur = cur.next;
            }
            map.put(nums[i], i);
        }
        return  head;
    }
}
