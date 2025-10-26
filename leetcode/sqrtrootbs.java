package leetcode;

public class sqrtrootbs {
    static void main() {
        int n = 40;
        int p = 3;
        System.out.println(sqrt(n,p));
    }

    public static double sqrt(int n, int p){
        double ans = 0.0;
        int s = 0;
        int e = n;

        while(s<=e){
            int m = s + (e-s)/2;
            if(m * m == n){
                return m;
            }

            if(m*m > n){
                e = m - 1;
            }else {
                s = m + 1;
            }
        }
        double ins = 0.1;
        for(int i=0; i<p; i++){
            while( ans * ans <= n){
                ans = ans + ins;
            }
            ans = ans - ins;
            ins = ins/10;
        }

        return ans;
    }
}
