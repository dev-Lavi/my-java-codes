package sample_codes;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {43,65,0,-2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxindex = findmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

    static int findmaxindex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
