package codechef;

public class codechief3 {
    public static void main(String[] args) {
        System.out.println("don't forget the ");
        int t = 2;
        int ones = 2;
        int twos = 1;
        int n = ones + twos;

        if(n%2==0){
            int arr[] = new int[n/2];
            int i = ones/2;
            int j = twos/2;
            int k=0;
            while(i>0){
                arr[k]=1;
                i--;
                k++;
            }
            while(j>0){
                arr[k]=2;
                k++;
                j--;
            }
            for(int p=0;p<arr.length ;p++){
                System.out.print(arr[p]);
            }
            for(int p=arr.length-1;p>=0;p--){
                System.out.print(arr[p]);
            }
        }else{
            int arr[] = new int[n/2+1];
            if(ones%2==0){
                arr[n/2]=2;
                int a = ones/2;
                int b = (twos-1)/2;
                int x=0;
                while(a>0){
                    arr[x]=1;
                    a--;
                    x++;
                }
                while(b>0){
                    arr[x]=2;
                    x++;
                    b--;
                }
            }else{
                arr[n/2]=1;
                int a = (ones-1)/2;
                int b = twos/2;
                int y=0;
                while(b>0){
                    arr[y]=2;
                    y++;
                    b--;
                }
                while(a>0){
                    arr[y]=1;
                    a--;
                    y++;
                }
            }
            for(int p=0;p<arr.length/2 ;p++){
                System.out.print(arr[p]);
            }
            System.out.print(arr[arr.length/2]);
            for(int p=arr.length/2-1;p>=0;p--){
                System.out.print(arr[p]);
            }
        }

    }
}
