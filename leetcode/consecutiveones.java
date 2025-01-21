package leetcode;

public class consecutiveones {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
        int result = consecutiveones(arr);
        System.out.println(result);
    }

    static int consecutiveones(int[] nums) {
        int n = nums.length;
        int p = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                count++;
            }else{
                if(count>p){
                    p = count;
                    count = 0;
                }
            }
        }
        if(count>p){
            return count;
        }
        return p;
    }
    }
