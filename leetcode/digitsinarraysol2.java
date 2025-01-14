package leetcode;

public class digitsinarraysol2 {
    public static void main(String[] args) {
        int[] arr = {2, 34, 543, 12, 43333};
        digitsinarraysol2(arr);
    }

    static int digitsinarraysol2(int[] nums) {
        int count;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            if (nums[i] < 0) {
                nums[i] = -1*nums[i];
            }
            count = (int)(Math.log10(nums[i]) + 1);
            if(count%2==0){
                ans = ans + 1;
            }
        }
        return ans;
    }
}