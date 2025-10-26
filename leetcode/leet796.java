package leetcode;

public class leet796 {
    public static void main() {
        String s = "abcde";
        String goal = "cdeab";
        boolean res = rotateString(s, goal);
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static int findchar(String s, char t){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == t ){
                return i;
            }
        }
        return 0;
    }
}
