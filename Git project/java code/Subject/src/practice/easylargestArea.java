package practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class easylargestArea {
    public static  int largestAera(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);
        Stack<Integer> mono_stack = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                right[mono_stack.peek()] = i;
                mono_stack.pop();
            }
            left[i] = (mono_stack.isEmpty() ? -1 : mono_stack.peek());
            mono_stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("请输入数组元素数目： ") ;
        Scanner input = new Scanner(System.in);
        int m= input.nextInt();
        int [] heights = new int[m];
        System.out.print("请输入数组元素： ") ;
        for(int i=0;i<m;i++){
            heights[i]= input.nextInt();
        }
        int result = largestAera(heights);
        System.out.print("可画出最大矩形面积为： "+result);
    }
}
