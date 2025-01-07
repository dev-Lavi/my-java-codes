package leetcode;

import java.util.Arrays;

public class tranformedarray {
    public static void main(String[] args) {
        int[] nums = {3,-2,1,1};
        int[] array = tranformarray(nums);
        System.out.println(Arrays.toString(array));
    }
    static int[] tranformarray(int[] nums){
        int i;
        int[] result = new int[nums.length];
        int n = nums.length;
        for (i=0;i<nums.length;i++){
            if(nums[i]>0){
                int j = (i + nums[i])%n;
                result[i] = nums[j];
            } else if(nums[i] < 0) {
                int j = (i+ nums[i])%n;
                if (j<0){
                    j = n+j;
                }
                result[i] = nums[j];
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
    }
