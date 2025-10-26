package leetcode;

public class leetcde448 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]>-1){
                int correct = nums[i];
               if(correct<nums.length && nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        int j;
        for(j=0; j<nums.length; j++){
            if(nums[j]>0){
                if(nums[j] != j){
                    return j;
                }
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
