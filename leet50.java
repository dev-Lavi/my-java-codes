public class leet50 {
    static void main() {
        double x = 2.000;
        int n = -4;
        System.out.println(powis(x,n));
    }

    public static double powis(double x, long n){
        if(n == 0 ){
            return 1;
        }
        if(n<0){
            return powis(1/x,-n);
        }
        if(n>0){
            if(n%2 == 0){
                return powis(x*x,n/2);
            }else{
                return x*powis(x*x,(n-1)/2);
            }
        }
        return 1;
    }
}

