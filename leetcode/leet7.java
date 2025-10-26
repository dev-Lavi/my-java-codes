package leetcode;

public class leet7 {
    static void main() {
        int x = 1534236469;
        System.out.println(reverseof(x));
    }

    public static int reverseof(int x){
        final int max = Integer.MAX_VALUE;
        final int min = Integer.MIN_VALUE;

        long rev = 0;
        int sign = 1;
        if(x<0){
            sign = -1;
            x = -x;
        }
        while(x>0){
            int rem = x % 10;
            rev = rev*10 + rem;
            x = x/10;
        }

        if(rev >= max || rev < min ){
            return 0;
        }

        if(sign == -1){
            return -(int)rev;
        }

        return (int)rev;
    }
}
