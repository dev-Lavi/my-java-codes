package leetcode;

public class searchtarget {
    public static void main(String[] args) {
        int[][] matrix = {{1,1}};
        int target =0;
        System.out.println(searchtarget(matrix,target));
    }

    static boolean searchtarget(int[][] matrix, int  target){
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = m*n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }else if(matrix[mid/m][mid%m]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}
