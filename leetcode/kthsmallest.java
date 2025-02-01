package leetcode;

public class kthsmallest {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        kthsmallest(matrix,k);
    }
    static int kthsmallest(int[][] matrix,int k){
        int n = matrix.length;
        int[] array = new int[n*n];
        int i = 0;
        int j = 0;
        int x = 0;
        while( x < n*n && j<n && i<n){
            if(j==n-1 && i<n-1){
                if(matrix[i][j]>matrix[i+1][0]){
                    System.out.println(matrix[i][j]);
                    array[x]=matrix[i+1][0];
                    array[x+1]=matrix[i][j];
                    x=x+2;
                    i++;
                    j=1;
                }else{
                    array[x]=matrix[i][j];
                    j=0;
                    i++;
                    x++;
                }
            }else{
                array[x]=matrix[i][j];
                j++;
                x++;
            }
        }
        int z = array[k-1];
        return z;
    }
}
