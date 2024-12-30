package leetcode;

import java.util.Arrays;

public class removeelement2 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3,};
        int val = 2;
        removeElement(nums, val);
    }

    static void removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if ((nums[j] != val)&&(nums[i] == val)) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        k = k- 1;
                    }
                }
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}


