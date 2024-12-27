import java.util.Scanner;
public class repeateddigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = in.nextInt();
        System.out.println("enter the digit you want to find");
        int d = in.nextInt(); //digit
        int t = 0;
        int r;
        while(n>0) {
            r = n % 10;
            if (r == d) {
                t++;
            }
            n = n / 10;
        }
        System.out.println("so the digit repeated for");
        System.out.println(t);
    }
}
