package leetcode;

public class leetc0de154 {
    public static void main(String[] args) {
        int[] nums = {3,4,6,7,1,2};
        int n = nums.length;
        int r = findrotation(nums);
        System.out.println(nums[r]);
    }

    static int findrotation(int[] nums){
        int first = 0;
        int last = nums.length-1;
        while(first<last){
            int middle = first + (last - first)/2;
                if(nums[middle]<=nums[last]) {
                    last = middle;
                }else {
                    first = middle + 1;
                }
            }
        return first;
    }
    }
