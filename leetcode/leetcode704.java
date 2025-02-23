package leetcode;

public class leetcode704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        search(nums,target);
        System.out.println('do not');
    }
    static int search(int[] nums , int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end = mid - 1;
            }else{
                start = end + 1;
            }
        }
        return -1;
    }
}
