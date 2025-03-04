package leetcode;

public class leetcode136 {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        findnumber(arr);
    }

    static int findnumber(int[] nums){
        int n = nums.length;
        int i=0;
        int j = 0;
        int count = 0;
        while(i<n){
            count = 0;
            while(j<n){
                if(nums[j]==nums[i]){
                    count++;
                }
                j++;
            }
            if(count>1){
                i++;
            }else{
                return i;
            }
        }
        return i;
    }
}
