package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("请输入数组元素数目；");
       int n= input.nextInt();
        int[] nums = new int[n];
       System.out.print("请输入数组元素；");
       for(int i = 0;i<n;i++){
           nums[i] = input.nextInt();
       }
       System.out.print("请输入target值:");
       int target = input.nextInt();
       int[] result = twosum.twosummethod(nums,target);
       for(int i=0;i<result.length;i++)
       System.out.print(result[i]+" ");

    }

    public static int[] twosummethod(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
