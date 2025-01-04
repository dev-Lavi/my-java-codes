package leetcode;

public class removeduplicate {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        removeduplicate(nums);
    }
    static int removeduplicate(int nums[]){
        int i,temp,k=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
