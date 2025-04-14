package leetcode;

public class leetcode1482 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        findkthpositive(arr,k);
    }

    public static int findkthpositive(int[] arr, int k){
        int count=0;
        int i = 1;
        for(i=1; i<=arr[arr.length-1]+k; i++){
            if(!checkava(arr, i)){
                count = count + 1;
            }
            if(count==k){
                break;
            }
        }
        return i;
    }

    static boolean checkava(int[] arr, int n){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(arr[mid]==n){
                return true;
            }else{
                if(arr[mid]>n){
                    last = mid - 1;
                }else{
                    first = mid + 1;
                }
            }
        }
        return false;
    }
}
