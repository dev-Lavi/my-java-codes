package leetcode;

public class maxarea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int area = maxarea(height);
        System.out.println(area);
    }

    static int maxarea(int[] height){
        int i,j,v,d,l;
        int a = 0;
        for(i=0;i<height.length;i++){
            for(j=height.length-1;j>i;j--){
                if(height[i]>height[j]){
                    d = height[i] - height[j];
                    l = height[i]-d;
                    v = l*(j-i);
                }else{
                    d = height[j]-height[i];
                    l = height[j]-d;
                    v = l*(j-i);
                }
                if(v>a){
                    a=v;
                }
            }
        }
        return a;
    }
}
