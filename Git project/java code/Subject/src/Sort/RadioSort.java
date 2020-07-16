package Sort;

import java.util.ArrayList;
import java.util.LinkedList;
public class RadioSort {
    //基数排序
    public static int[] radioSort(int[] arr){
        if(arr==null||arr.length<2)return arr;
        int n = arr.length;
        int max = arr[0];
        //找出最大值
        for (int i = 0; i < n; i++) {
            if(max<arr[i]) max = arr[i];
        }
        //计算最大值是几位数
        int num = 1;
        while(max/10>0){
            num++;
            max=max/10;
        }
        //创建10个桶
        ArrayList<LinkedList<Integer>> bucketList = new ArrayList<>(10);
        //初始化桶
        for (int i = 0; i < 10; i++) {
            bucketList.add(new LinkedList<>());
        }
        //进行每一趟的排序，从个位数开始
        for (int i = 1; i <=num ; i++) {
            for (int j = 0; j < n; j++) {
                //获取每个数的位数值作为桶号并放入桶中
                int radio = (arr[j]/(int)Math.pow(10,i-1))%10;
                bucketList.get(radio).add(arr[j]);
            }
            //合并放回原数组
            int k =0;
            for (int j = 0; j < 10; j++) {
                for (Integer t : bucketList.get(j)) {
                    arr[k++]=t;
                }
                //取出来合并了之后把桶清光数据
                bucketList.get(j).clear();
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a={50,2,3,45,35,7,47,93,100};
        int[] b =radioSort(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+"  ");
        }
    }
}
