package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class leet451 {
    static void main() {
        String s = "tree";
        frequencySort(s);
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());


        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list){
            char c = entry.getKey();
            int freq = entry.getKey();
            for(int i=0; i < freq; i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
