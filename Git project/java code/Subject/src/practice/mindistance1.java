package practice;

import java.util.HashMap;
import java.util.Map;

public class mindistance1 {
    public static void main(String[] args) {
        Map<Character, Integer> hashmap = new HashMap<>();
        String c = "abca";
        char[] s=c.toCharArray();
        int min = s.length;
        for (int i = 0; i < s.length; i++) {
            if (hashmap.containsKey(s[i])) {
                min = Math.min(min, i - hashmap.get(s[i]));
            }
            hashmap.put(s[i], i);
        }
        if(min==s.length)
            System.out.print(-1);
        else System.out.print(min);
    }
}
