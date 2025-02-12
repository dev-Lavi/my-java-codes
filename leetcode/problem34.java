package leetcode;

public class problem34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        findstartend(nums,target);
    }

    static int[] findstartend(int[] nums, int target){
        int n = nums.length;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]>target){
                end = mid - 1;
            }else if(nums[mid]==target){
                result[0] =  mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        start = 0;
        end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]>target){
                end = mid - 1;
            }else if(nums[mid]==target){
                result[1] = mid;
                start = mid + 1;
            }else{
                start = mid + 1;
            }
        }
        return result;
    }
}
