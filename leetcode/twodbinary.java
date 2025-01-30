package leetcode;

public class twodbinary {
    public static void main(String[] args) {
        int[][] matrix = {{-1,3}};
        int target = -1;
        binarysearch2d(matrix, target);
    }

    static boolean binarysearch2d(int[][] matrix,int target){
        int end = matrix.length;
        int start2 = 0;
        int mid2;
        int end2;
        for(int i=0;i<end;i++){
            end2 = matrix[i].length;
            while(start2<=end2){
                mid2 = (start2+end2)/2;
                if(matrix[i][mid2]==target){
                    System.out.println("do not forget");
                    return true;
                }else if(matrix[i][mid2]>target){
                    end2 = mid2 - 1;
                }else{
                    start2 = mid2 + 1;
                }
            }
        }
        return false;
    }
}
