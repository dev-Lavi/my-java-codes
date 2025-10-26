package sample_codes;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[] = {5,3,6,1,2,4};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void cyclesort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
