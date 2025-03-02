package leetcode;

public class leetcode189 {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotate(nums, k);
    }

    static void rotate(int[] nums, int k){
        int n = nums.length;
        while(k>0){
            int t=0;
            int s=0;
            System.out.println("do not forget");
            for(int i=0; i<n; i++){
                if( i == n-1 ){
                    nums[0] = s;
                }else if(i==0){
                    t = nums[i+1];
                    nums[i+1]=nums[i];
                }else{
                    if( i%2 == 0 ){
                        t = nums[i+1];
                        nums[i+1] = s;
                    }else{
                        s = nums[i+1];
                        nums[i+1] = t;
                    }
                }
            }
            k--;
        }
    }
}
