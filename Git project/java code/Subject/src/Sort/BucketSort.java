package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BucketSort {
    //桶排序，可用于浮点数排序
    public static double[] bucketSort(double[] array){
        //得到数列的最大值和最小值，并算出差值d
        double max = array[0];
        double min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if(array[i]<min)
                min = array[i];
        }
        double d = max-min;
        //初始化桶
        int bucketNum = array.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<LinkedList<Double>>(bucketNum);
        for (int i = 0; i <bucketNum ; i++) {
            bucketList.add(new LinkedList<Double>());
        }
        //遍历原始数组，将每个元素放入桶中
        for (int i = 0; i < array.length; i++) {
            /**
             * 要定位array[i]在第几个桶，先减去最小值min，
             * 看它在桶数组（ArrayList）中的偏移为多少，
             * 然后除以桶的区间大小d/(bucketNum-1),
             * 相当于乘以(bucketNum-1)/d，
             * 除以桶区间大小就可以定位在哪个桶里了。
             */
            int num = (int)((array[i]-min)*(bucketNum-1)/d);
            bucketList.get(num).add(array[i]);
        }
        //对每个桶内部进行排序
        for (int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }
        //输出全部元素
        double[] sortedArray = new double[array.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (Double element : list) {
                sortedArray[index++]=element;
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        double[] array = {4.12,6.421,0.0023,3.0,2.123,8.122,4.12,10.09};
        double[] sortedArray = bucketSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
