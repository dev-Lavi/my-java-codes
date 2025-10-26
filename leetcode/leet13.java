package leetcode;

import java.util.*;

public class leet13 {
    static void main() {
        String s = "III";
        System.out.println(s.length());
        romanToInt(s);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        int prev = 0;

        for(int i=s.length()-1; i>0; i--){
            char c = s.charAt(i);


            if( map.get(c) >= prev){
                total = map.get(c) + total;
                prev = map.get(c);
            }else{
                total = total - map.get(c);
                prev = map.get(c);
            }

        }
        return total;
    }
}
