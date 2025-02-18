package leetcode;

public class leetcode34 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        searchh(nums,target);
    }
    static int searchh(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int pivot = findPivot(nums);
        if(pivot==-1){
            end = n-1;
            return binarysearch(nums,target,start,nums.length-1);
        }
        if(target<nums[start]){
            return binarysearch(nums,target,pivot+1,end);
        }else{
            return binarysearch(nums,target,start,pivot-1);
        }
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]>nums[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]>target){
                end = mid - 1;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
