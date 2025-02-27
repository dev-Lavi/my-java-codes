package leetcode;

public class leetcode75 {
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};

        int r = countcolor(nums,0);
        int w = countcolor(nums,1);
        int b = countcolor(nums,2);
        int p = 0;
        int s=0;
        int q=0;
        for(int i=0; i<3; i++){
            if(i==0){
                q=modify(nums,r,p,0);
            }else if(i==1){
                s=modify(nums,w,q,1);
            }else{
                modify(nums,b,s,2);
            }
        }
    }


    static int countcolor(int[] nums,int v){
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==v){
                count++;
            }
        }
        return count;
    }

    static int modify(int[] nums,int n,int p,int v){
        while(n>0){
            nums[p]=v;
            p++;
            n--;
        }
        return p;
    }
}
