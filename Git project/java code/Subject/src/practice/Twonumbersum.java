package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Twonumbersum {
    public static void main(String[] args) {
        int target;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入target值： ");
        target = input.nextInt();
        System.out.print("请输入数组值数目： ");
        int n = input.nextInt();
        int[] nums = new int[n];
        System.out.print("请输入数组值： ");
        for(int i = 0;i <n;i++){
            nums[i] = input.nextInt();
        }
        int[] res= twosum(nums,target);
        int[] r = new int[nums.length];
        if(res.equals(r)) {
            System.out.print(' ');
        }
        else {
            int len = res.length;
            for (int i = res.length-1; i >= 1; i--) {
                if(res[i] == 0) {
                    len--;
                    if (res[i - 1] != 0) break;
                }
            }
            for (int i = 0; i < len; i++) {
                System.out.print(res[i]+" ");
            }
        }

    }
    public static int[] twosum(int[] nums,int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if(map.containsKey(value)){
                res[i-1] = map.get(value);
                res[i] = i;
            }
            map.put(nums[i],i);
        }
        return res;
    }

}
