public class armstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            printarmstrong3digit(i);
        }
    }

    static void printarmstrong3digit(int n) {
        int old = n;
        int j = 0;
        while (n > 0) {
            int r = n%10;
            j = r*r*r + j;
            n = n/10;
        }
        if(j==old){
            System.out.println(old);
        }
    }
}