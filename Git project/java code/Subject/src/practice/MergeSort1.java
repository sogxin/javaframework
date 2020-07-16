package practice;

public class MergeSort1 {
    //归并排序，递归拆分至长度为一的数组，然后按拆分顺序反向合并1变2,2变4....
    public static int[] mergeSort(int[] a,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            a = mergeSort(a,left,mid);
            a = mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }
        return a;
    }
    public static void merge(int[] a,int left,int mid,int right){
        int[] a1 = new int[right-left+1];//每次开辟一个刚好够两个合并后的空间
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=right){
            if(a[i]<a[j]){
                a1[k++]=a[i++];
            }else{
                a1[k++]=a[j++];
            }
        }
        while(i<=mid) a1[k++] = a[i++];//合并可能出现一个已全放入一个还没完全放入的情况，把剩下的放入数组中。
        while(j<=right) a1[k++] = a[j++];
        for (int l = 0; l <k ; l++) {
            a[left++] = a1[l];
        }

    }
    public static void main(String[] args) {
        int[] a = {23,98,45,7,24,674,100};
        int n = a.length;
        mergeSort(a,0,n-1);
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}
