package leetcode;
import java.util.Scanner;
import java.util.Arrays;

public class removeelement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        int val = in.nextInt();
        int k= nums.length;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=0;
                k=k-1;
            }
                }
        //sorting
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]==0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(k);
        System.out.print(Arrays.toString(nums));
    }
}
