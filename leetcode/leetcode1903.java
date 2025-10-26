package leetcode;

public class leetcode1903 {
    public static void main(String[] args) {
        String str = "52";
        System.out.println(Largestoddnum(str));

    }


    public static String Largestoddnum(String num) {
        char[] arr1 = num.toCharArray();
        int n = arr1.length-1;
        while(n>=0){
            if((arr1[n]-'0') % 2 != 0){
                return new String(arr1,0,n+1);
            }
            n--;
        }
        return "";
    }
}
