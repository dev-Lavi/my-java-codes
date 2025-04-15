package leetcode;

public class leetcode560 {
    public static void main(String[] args) {
        int[] nums = {1,-1,0};
        int k = 0;
        countsubarrays(nums, k);
    }

    static int countsubarrays(int[] nums, int k){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            int j = i;
            while(j<nums.length){
                sum = sum + nums[j];
                if(sum==k){
                    count = count + 1;
                }
                j++;
            }
        }
        return count;
    }
}
