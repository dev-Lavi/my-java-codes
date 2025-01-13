package leetcode;

public class findevenoofdigitelement {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        findevenoofdigitelement(nums);
    }

    static int findevenoofdigitelement(int[] nums){
        int count = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            while(nums[i]>0){
                nums[i] = nums[i]/10;
                count++;
                }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}
