package leetcode;

public class count_negative {

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }


public static int countNegatives(int[][] grid) {
    int r = grid.length;
    int c = grid[0].length;
    int count = 0;
    for(int i=0; i<r-1; i++){
        for(int j=c-1; j>=0; j--){
            if( grid[i][j] < 0){
                count++;
            }else{
                break;
            }
        }
    }
    return count;
}
}
