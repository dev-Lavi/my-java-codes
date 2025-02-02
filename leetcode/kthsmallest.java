package leetcode;

public class kthsmallest {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        kthsmallest(matrix,k);
    }
    static int kthsmallest(int[][] matrix,int k){
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        while(low<=high){
            int mid = low + (high - low)/2;
            int count = 0;
            for(int i=0; i<n; i++){
                 count = count + upper_bound(matrix[i].begin(),matrix[i].end(),mid) - matrix[i].begin();
            }
            if(count<k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
