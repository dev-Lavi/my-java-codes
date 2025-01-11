package leetcode;

public class plusone {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        plusone(digits);
    }
    static int[] plusone(int[] digits){
        int n = digits.length;
        digits[n-1]=digits[n-1]+1;
        int j=n-2;
        while(j>=0 && digits[j+1]==10){
            digits[j+1]=0;
            digits[j]=digits[j]+1;
            j--;
        }
        if(digits[j+1]==10){
            int[] result = new int[n+1];
            result[0]=1;
            result[1]=0;
            for(int k=2;k<n;k++){
                result[k]=digits[k];
                return result;
            }
            return result;
        }
        return digits;
    }
}
