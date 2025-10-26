package leetcode;

public class leet204 {
    static void main() {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        boolean[] notprimes = new boolean[n];
        int count = 0;
        for(int i=2; i<n; i++){
            if(notprimes[i] == false){
                count++;
                for(int j=2; i*j < n; j++){
                    notprimes[i*j] = true;
                }
            }
        }
        return count;
    }
}
