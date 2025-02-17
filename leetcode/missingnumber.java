package leetcode;

public class missingnumber {
    public static void main(String[] args) {
        int[] arr = {0,2};
        missingnumber(arr);
        System.out.println("do not forgot the dream");

    }
    static int missingnumber(int[] nums){
        int n = nums.length;
        int j = 0;
        int sum = 0;
        for(int i=0;i<=n;i++){
            j = i + j;
            if(i<n){
                sum = nums[i] + sum;
            }
        }
        return j - sum;
    }

    }

