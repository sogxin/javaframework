package practice;

import java.util.Scanner;

public class findmedian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数组1元素数目： ");
        int m=input.nextInt();
        int[] nums1= new int[m];
        System.out.print("请输入数组1元素： ");
        for(int i=0;i<m;i++){
            nums1[i] = input.nextInt();
        }
        System.out.print("请输入数组2元素数目: ");
        int n = input.nextInt();
        int[] nums2 = new int[n];
        System.out.print("请输入数组2元素： ");
        for(int i=0;i<n;i++){
            nums2[i]=input.nextInt();
        }
        findmedian1 is =  new findmedian1();
        double result = is.findMedianSortedArrays(nums1,nums2);
        System.out.print(result);
    }
}
