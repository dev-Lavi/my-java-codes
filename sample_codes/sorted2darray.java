package sample_codes;

import java.util.Arrays;

public class sorted2darray {
    public static void main(String[] args) {
        int[][] arr = {{34, 36, 38 ,43},
                      {45, 48, 52, 55},
                      {59, 62, 64, 65},
                      {70, 78, 81, 85}};
        System.out.println(Arrays.toString(search2d(arr,45)));
        System.out.println("do not");
    }
    static int[] binarysearch(int[][] arr, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart)/2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            }
            if(arr[row][mid] < target){
                cstart = mid + 1;
            }else{
                cend = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search2d(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return binarysearch(arr,0,0,cols-1,target);
        }

        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;

        //run the loop untill 2 loops are left
        while(rstart < (rend - 1)){
            int mid = rstart + (rend - rstart)/2;

            if(arr[mid][cmid] == target ){
                return new int[]{mid , cmid};
            }
            if(arr[mid][cmid] > target){
                rend = mid;
            }else{
                rstart = mid;
            }
        }

        //now only 2 rows are left
        //check in the mid coloum 2 elements
        if(arr[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }
        if(arr[rstart + 1][cmid] == target){
            return new int[]{rstart + 1, cmid};
        }

        //now search in first half
        if(target <= arr[rstart][cmid-1] ){
           return binarysearch(arr,rstart,0,cmid-1,target);
        }
        if(target >= arr[rstart][cmid+1] && target < arr[rstart][cols-1] ){
            return binarysearch(arr,rstart,cmid+1,cols-1,target);
        }
        if(target <= arr[rstart+1][cmid-1] ){
            return binarysearch(arr,rstart+1,0,cmid-1,target);
        }else{
           return binarysearch(arr,rstart+1,cmid+1,cols-1,target);
        }
    }
}
