package leetcode;

public class rearrangearrayelements {
    public static void main(String[] args) {
        int[] arr = {-1,1};
        rearrangearrayelements(arr);
    }

    static int[] rearrangearrayelements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] positive = new int[n];
        int[] negative = new int[n];
        int p = 0;
        int q = 0;
        for(int i=0; i<n ; i++){
            if(nums[i]>=0){
                positive[q]=nums[i];
                q++;
            }else{
                negative[p]=nums[i];
                p++;
            }
        }
        p = 0;
        q = 0;
        for(int j=0; j<n; j++){
            if(j%2==0){
                result[j]=positive[p];
                p++;
            }else{
                result[j]=negative[q];
                q++;
            }
        }
        System.out.println("lavi sharma don't forget");
        return result;

    }
}
