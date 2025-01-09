package leetcode;

public class plusone {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        plusone(digits);
    }
    static int[] plusone(int[] digits){
        int num = 0;
        int r;
        int[] result = new int[digits.length];
        for(int i=0;i<digits.length;i++){
            num = num*10 + digits[i];
        }
        num = num + 1;

        for(int j=digits.length-1;j>=0;j--){
            r = num%10;
            result[j] = r;
            num = num/10;
        }

        return result;
    }
}
