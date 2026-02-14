package leetcode;

public class leet930 {

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int k = 2;
        System.out.println(numSubarraysWithSum(nums, k));
    }


    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int curr = 0;
        int l = 0;
        int r = 0;
        int count = 0;

        while(curr != goal){
            curr = curr + nums[r];
            r++;
        }

        count++;

        while(r < n && l<n){
            curr =  curr + nums[r];
            while(curr >= goal && l<n){
                curr  = curr - nums[l];
                if(curr == goal){
                    count++;
                }
                l++;
            }

            if(curr == goal){
                count++;
            }
            r++;
        }

        return count;
    }
}
