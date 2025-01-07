package leetcode;

import java.util.Arrays;

public class tranformedarray {
    public static void main(String[] args) {
        int[] nums = {3,-2,1,1};
        int[] array = tranformarray(nums);
        System.out.println(Arrays.toString(array));
    }
    static int[] tranformarray(int[] nums){
        int i,j;
        int[] result = new int[nums.length];
        int n = nums.length;
        for (i=0;i<nums.length;i++){
            j = i + nums[i];
            if(0<=j && j<nums.length){
                result[i] = nums[j];
            }
            else if(j>=nums.length){
                j = j-nums.length;
                result[i] = nums[j];
            }else if(j<0){
                j = nums.length + j;
                result[i] = nums[j];
            }
        }
        return result;
    }
    }
