package leetcode;

public class slidingwindow {

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }


    public static double findMaxAverage(int[] nums, int k) {
        double maxavg = Integer.MIN_VALUE;
        int l = 0;
        int r = 0;
        int n = nums.length;
        double currsum = 0;

        while(r <= k-1){
            currsum = currsum + nums[r];
            r++;
        }

        maxavg = Math.max(maxavg, currsum/k);

        while(r<n){
            currsum = currsum - nums[l] + nums[r];
            maxavg = Math.max(maxavg, currsum/k);
            l++;
            r++;
        }

        return maxavg;
    }
}
