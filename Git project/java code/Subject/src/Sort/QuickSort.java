package Sort;
//快速排序
/**
 * 1.选取中轴元素，一般选取数组第一个元素作为中轴元素。
 * 2.分别从中轴元素左边第一个元素开始从左向右遍历，从数组最后一个元素开始从右向左遍历。
 * 3.从左边开始遍历的选取大于中轴元素的数，从右开始遍历的选取小于中轴元素的数，每选取一对数就两两交换。
 * 4.直到遍历完数组为之，此时小于中轴元素的数位于左侧，大于中轴元素的数位于右侧，将中轴元素与小于中轴元素的最后一个元素交换保证
 * 中轴元素相对有序，
 * 5.以中轴元素为界限将数组分为两部分，继续执行上述操作。
 */
public class QuickSort {
    public static int[] quickSort(int[] arr,int left,int right){
        if(left<right){
            //获取中轴元素所处的位置
            int mid = partition(arr,left,right);
            //进行分割
            arr = quickSort(arr,left,mid-1);
            arr = quickSort(arr,mid+1,right);
        }
        return arr;
    }
    private static int partition(int[] arr,int left,int right){
        //选取中轴元素
        int pivot = arr[left];
        int i = left+1;
        int j = right;
        while(true){
            //向右找到第一个小于等于pivot的元素位置
            while(i<=j && arr[i]<=pivot) i++;
            //向左找到第一个大于等于pivot的元素位置
            while (i<=j && arr[j]>=pivot) j--;
            if(i>j)
                break;
            //交换两个元素的位置，使得左边的元素不大于pivot，右边的不小于pivot
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[j];
        //使中轴元素处于有序的位置
        arr[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        int[] a = {1,6457,34,23,36,97,5,39,40};
        int n = a.length;
        int[] b = quickSort(a,0,n-1);
        for (int i = 0; i <n; i++) {
            System.out.print(b[i]+"  ");
        }
    }
}
