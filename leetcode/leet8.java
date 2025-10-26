package leetcode;

public class leet8 {
    static void main() {
        String s = "1";
        int result = myAtoi(s);
    }

    public static int myAtoi(String s) {
        int sign = 1;
        if(s.length() == 0){
            return 0;
        }

        final int maxx = Integer.MAX_VALUE;
        final int minn = Integer.MIN_VALUE;

        int i = 0;

        while( i< s.length() && s.charAt(i) == ' ' ){
            i++;
        }

        if( i == s.length()-1){
            return 0;
        }

        if( s.charAt(i) == '+'){
            i++;
        }else if( s.charAt(i) == '-'){
            sign = -1;
            i++;
        }

        long res = 0;

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;

            if( sign * res <= minn){
                return minn;
            }
            if( sign * res >= maxx){
                return maxx;
            }

            i++;
        }

        return (int)(res * sign);
    }
}
