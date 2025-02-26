package leetcode;

public class codechief2_26 {
    public static void main(String[] args) {
        int n = 4;
        findtime(n);
    }

    static int findtime(int n){
        int count = 0;
        while(n>0){
            count++;
            if(n==1 || n==3 ){
                return count;
            }
            if(n==2){
                n--;
            }else{
                n = n-2;
            }
        }
        return -1;
    }
}

