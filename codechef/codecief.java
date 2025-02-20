package codechef;
import java.util.*;
import java.io.*;

public class codecief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String a = scanner.next();
            System.out.println(findLargerName(n, a));
            System.out.println("do not forget");
        }
        scanner.close();
    }
    public static String findLargerName(int n, String a) {
        char[] name = a.toCharArray();

        for (int i = n - 1; i >= 0; i--) {
            if (name[i] != 'z') {
                name[i]++;  // Increment character
                String newName = new String(name);
                String reversedName = new StringBuilder(newName).reverse().toString();

                if (newName.compareTo(a) > 0 && reversedName.compareTo(a) > 0) {
                    return newName;
                }

                name[i]--;
            }
        }
        return "-1";
    }
}
