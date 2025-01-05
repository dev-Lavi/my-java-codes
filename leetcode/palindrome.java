package leetcode;

public class palindrome {
    public static void main(String[] args) {
        int x = 121;
        checkpalindrome(x);
        if (true){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

    static boolean checkpalindrome(int x){
        int r =0;
        int rev = 0;
        int y = x;
        while(x>0){
            r = x % 10;
            rev = rev*10 + r;
            x = x/10;
        }
        if(rev==y){
            return true;
        }
        return false;
    }
}
