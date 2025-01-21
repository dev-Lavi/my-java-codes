package leetcode;

public class consecutiveones {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int result = consecutiveones(arr);
        System.out.println(result);
    }

    static int consecutiveones(int[] nums) {
        int n = nums.length;
        int p = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0) count = 0;
            else{
                count++;
                if(p < count){
                    p = count;
                }
            }
        }
        return p;
    }
    }
