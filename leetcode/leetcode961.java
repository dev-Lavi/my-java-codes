package leetcode;
import java.util.*;

public class leetcode961 {
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));
    }
        public static int repeatedNTimes(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            int c = n/2 - 1;
            int prev = 0;
            for(int i=1; i<n; i++){
                prev = nums[i-1];
                if( nums[i] == prev ){
                    c--;
                }

                if(c == 0){
                    return prev;
                }
            }
            return nums[1];
        }
}
