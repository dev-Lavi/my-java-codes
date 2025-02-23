package sample_codes;

import java.util.Arrays;

public class traversal2darray {
    public static void main(String[] args) {
        int[][] arr = {{34,54,65,73},
                       {35,57,69,79},
                       {46,62,75,81},
                       {50,68,78,85}};
        System.out.println(Arrays.toString(search2d(arr,50)));
    }

    static int[] search2d(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;
        while(c >= 0 && r < arr.length){
            if(arr[r][c] == target){
                return new int[]{r , c };
            }
            if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
