package codechef;
import java.util.*;
public class minimumbottles {
    public static void main(String[] args) throws java.lang.Exception {
        int c = 2;
        int b = 3;
        int capacity = 10;
        int[] A = {1,2,3};
        int y = 4;
        int capacityy = 2;
        int[] Z = {1,2,2,1};
        int total = 0;
        for (int j=0; j<b; j++) {
            total = A[j]+total;
        }
        int a = b * capacity;
        int ans;
        if (total % capacity == 0) {
            ans = total / a;
            System.out.println(ans);
        } else {
            ans = total/capacity;
            System.out.println(ans + 1);
        }
        int totall = 0;
        for (int n=0; n<y; n++) {
            totall = Z[n]+totall;
        }
        int o = y * capacityy;
        int anss;
        if (totall % capacityy == 0) {
            anss = totall / capacityy;
            System.out.println(anss);
        } else {
            anss = totall/capacityy;
            System.out.println(anss + 1);
        }
    }
}
