package leetcode;

public class searchinsertposition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = searchinsertposition(nums,target);
        System.out.println(result);
    }
    static int searchinsertposition(int[] nums,int target){
        int i=0;
        while(i<nums.length && nums[i]<=target){
            if(nums[i]==target){
                return i;
            }
            i++;
        }
        return i;
    }
}
