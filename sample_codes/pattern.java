package sample_codes;

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        pattern5(n);
    }

    public static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=1; i <= 2*n-1; i++){
            int totalcolsinrow = i > n ? 2*n - i : i;
            int numofspaces = n-totalcolsinrow;

            for(int k=1; k<=numofspaces; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=totalcolsinrow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=1; i <=n; i++){
            int numofspaces = n-i;
            int totalcolsinrow = n-numofspaces;

            for(int k=1; k<=numofspaces; k++){
                System.out.print(" ");
            }
            for(int j=totalcolsinrow; j>=1; j--){
                System.out.print(j);
            }
            for(int s=2; s<=totalcolsinrow; s++){
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1; i <=2*n-1; i++){
            int numofspaces = i > n ? i-n : n-i;
            int totalcolsinrow = n-numofspaces;

            for(int k=1; k<=numofspaces; k++){
                System.out.print(" ");
            }
            for(int j=totalcolsinrow; j>=1; j--){
                System.out.print(j);
            }
            for(int s=2; s<=totalcolsinrow; s++){
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        int m = 2*n;
        for(int i=0; i<=m; i++){
            for(int j=0; j<=m; j++){
                int input = n-Math.min(Math.min(i,j), Math.min(m-i,m-j));
                System.out.print(input + " ");
            }
            System.out.println();
        }
    }
}
