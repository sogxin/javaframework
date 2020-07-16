package practice;

public class SelectSort {
    //选择排序
    public static int[] selectSort(int[] a){
        int n=a.length;
        for (int i = 0; i <n-1 ; i++) {
            int ITem =a[i];
            int ipos = i;
            for (int j = i+1; j <n ; j++) {
                if (a[j]<ITem) {
                    ITem=a[j];
                    ipos = j;
                }
            }
            a[ipos]=a[i];
            a[i]=ITem;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {34,85,398,56,2345,56,10,6};
        SelectSort.selectSort(a);
        int m=a.length;
        for (int i = 0; i <m ; i++) {
            System.out.print("  "+a[i]);
        }
    }
}
