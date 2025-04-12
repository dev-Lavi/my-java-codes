package leetcode;

public class leetcode1823 {
    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 6;
        System.out.println(smallestdivisor(nums, threshold));
    }

    static int smallestdivisor(int[] nums, int threshold){
        int  first = 1;
        int last = 0;
        for( int i=0; i<nums.length; i++ ){
            last = Math.max(last,nums[i]);
        }
        int res = last;

        while(first <= last){
            int mid = first + (last - first)/2;
            if(isvalid(nums, mid, threshold)){
                res = mid;
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return res;
    }

    static boolean isvalid(int[] nums, int d, int threshold){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + (nums[i] + d - 1)/d;
            if(sum > threshold){
                return false;
            }
        }
        return sum <= threshold;
    }

}
