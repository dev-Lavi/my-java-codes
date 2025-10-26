package leetcode;

public class leetcode_151 {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.trim().split(" ");

        for(int i=0; i<words.length/2;i++){
            String temp = words[i];
            words[i]= words[words.length-1-i];
            words[words.length - 1 - i] = temp;
        }

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i > 0) ans.append(" ");
        }
        return ans.toString();
    }
}
