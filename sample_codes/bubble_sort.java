package sample_codes;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {34,65,0,-32,-11};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
