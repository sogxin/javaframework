package Sort;

public class SelectSort1 {
    //选择排序
    public static int[] selectSort1(int[] a){
        int n=a.length;
        for (int i = 0; i <n-1 ; i++) {
            int min = i;
            for (int j = i+1; j <n ; j++) {
                if (a[j]<a[min]) {
                   min= j;
                }
            }
           int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {100,85,67,897,2345,78,10,6};
          selectSort1(a);
        int m=a.length;
        for (int i = 0; i <m ; i++) {
            System.out.print("  "+a[i]);
        }
    }
}
