package leetcode;

public class kthsmallest {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        int answer = kthsmallest(matrix,k);
        System.out.println(answer);
    }
    static int kthsmallest(int[][] matrix,int k){
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low != high){
            int mid = low + (high - low)/2;
            int count = numberoflessorequalthan( matrix, mid);
            if(count<k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return high;
    }

    public static int numberoflessorequalthan(int[][] matrix,int mid){
        int count = 0;
        int row = 0;
        int column = matrix.length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]<=mid){
                count = count + column + 1;
                row++;
            }else{
                column--;
            }
        }
        return count;
    }
}
