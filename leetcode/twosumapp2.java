package leetcode;

public class twosumapp2 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        int target = 6;
        twosumapp2(nums, target);
    }

    static int[] twosumapp2(int[] nums, int target) {
        int i, j;
        int arr[] = new int[2];
        for (i = 1; i < nums.length; i++) {
            for (j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - 1] == target) {
                    arr[0] = j;
                    arr[1] = j - 1;
                    return arr;
                } else {
                    arr[0] = 0;
                    arr[1] = j;
                    return arr;

                }
            }
        }
        return arr;
    }
}

