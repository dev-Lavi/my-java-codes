package leetcode;

public class findevenoofdigitelement {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int result = findevenoofdigitelement(nums);
        System.out.println(result);
    }

    static int findevenoofdigitelement(int[] nums){
        int count;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            if(nums[i]<0){
                nums[i] = -1*nums[i];
            }
            count = (int)(Math.log10(nums[i]))+1;

            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}
