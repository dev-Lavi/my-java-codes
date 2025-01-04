package leetcode;

public class removeduplicate {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        removeduplicate(nums);
    }
    static int removeduplicate(int nums[]){
        int i,j,temp,k=0;
        for(i=1;i<nums.length;i++){
            for(j=i;j<nums.length;j++){
                if(nums[j-1]<nums[j]){
                    temp=nums[j-1];
                    nums[j-1]= nums[j];
                    nums[j]=temp;
                }
            }
            for(int m=1;m<nums.length;m++){
                if(nums[m]!=nums[m-1]){
                    k++;
                }
            }
        }
        return k;
    }
}
