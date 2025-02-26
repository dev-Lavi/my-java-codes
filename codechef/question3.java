package codechef;
import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int N = in.nextInt();
            in.nextLine();
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            System.out.println(findoperations(N, a, b, c));
        }
        in.close();
    }

     static int findoperations(int N, String a, String b, String c){

        int[] count0 = new int[3];
        int[] count1 = new int[3];

        count0[0] = countOccurrences(a, '0');
        count0[1] = countOccurrences(b, '0');
        count0[2] = countOccurrences(c, '0');

        for (int i = 0; i < 3; i++) {
            count1[i] = N - count0[i];
        }

        int total0 = count0[0] + count0[1] + count0[2];
        int total1 = 3 * N - total0;

        if (total0 % 3 != 0 || total1 % 3 != 0) {
            return -1;
        }

        int target0 = total0 / 3;
        int target1 = N - target0;

        int excess0 = 0, excess1 = 0;

        for (int i = 0; i < 3; i++) {
            if (count0[i] > target0) {
                excess0 += count0[i] - target0;
            }
            if (count1[i] > target1) {
                excess1 += count1[i] - target1;
            }
        }

        return Math.max(excess0, excess1);

    }

    static int countOccurrences(String s, char c){
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}
