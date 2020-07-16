package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mindistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符串数目: ");
        int n = input.nextInt();
        String[] str = new String[n];
        System.out.println("请输入字符串: ");
        for(int i =0;i<n;i++){
            str[i] = input.next();
        }
        int min=n;
        Map<String,Integer> hashmap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hashmap.containsKey(str[i])){
                min = Math.min(min,i-hashmap.get(str[i]));
            }
            hashmap.put(str[i],i);
        }
        if(min==n)
            System.out.print(-1);
        else System.out.print(min);
        input.close();
    }
}
