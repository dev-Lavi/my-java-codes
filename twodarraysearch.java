import java.util.Arrays;

public class twodarraysearch {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},{23,43,53,12,43},{432,264}
        };
        int target = 12;
        int[] result = search2d(array,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] search2d(int arr[][],int target){
        for(int i=0;i<arr.length;i++ ){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
