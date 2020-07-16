package practice;

public class BubbleSort {
    //冒泡排序
    public  static int[] bubbleSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for (int j = 0; j <n-i-1 ; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] =a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return  a;
    }

    public static void main(String[] args) {
        int[] a ={234,4,56,954,34,69,583,1900};
        int n=a.length;
        bubbleSort(a);
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]+"  ");
        }

    }
}
