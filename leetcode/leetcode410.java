package leetcode;

public class leetcode410 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        splitarray(nums,k);
    }

    static int splitarray(int[] nums,int k){
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end = end + nums[i];
        }

        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int subarr = 1;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    subarr++;
                }else{
                    sum = sum + num;
                }
            }
            if(subarr>k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
