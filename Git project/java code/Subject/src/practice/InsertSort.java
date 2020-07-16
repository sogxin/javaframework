package practice;

public class InsertSort {
    //插入排序
    public static int[] insertSort(int[] a){
        if(a==null||a.length<2) return a;
        int n = a.length;
        for (int i=1;i<n;i++){
            int temp = a[i];
            int k=i-1;
            while(k>=0 && a[k]>temp)
                k--;
            for(int j=i;j>k+1;j--)
                a[j]=a[j-1];
            a[k+1] = temp;
        }
         return a;
    }

    public static void main(String[] args) {
        int[] a={23,45,3,578,432,6,8,100};
        int[] b = insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(" "+b[i]);
        }

    }
}
