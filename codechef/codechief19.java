package codechef;
import java.util.*;

public class codechief19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                for(int j=1; j<=n; j++){
                    if(j%k==(i+1)%k && j!=i+1){
                        arr[i] = j;
                    }
                }
            }

        }
    }
}
