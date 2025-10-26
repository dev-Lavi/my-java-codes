import java.util.*;

public class leet1838 {
    static void main() {
        int[] arr = {3,6,9};
        int k = 2;
        System.out.println(maxFrequency(arr, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int total = 0;
        int res = 0;
        int l = 0;
        int r = 0;
        while(r < nums.length - 1){
            total += nums[r];
            while(nums[r]*(r-l+1) > total + k){
                total = total - nums[l];
                l++;
            }
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}
