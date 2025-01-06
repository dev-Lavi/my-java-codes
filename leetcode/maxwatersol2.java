package leetcode;

public class maxwatersol2 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int area = maxwatersol2(height);
        System.out.println(area);
    }
    static int maxwatersol2(int[] height){
        int i = 0;
        int j = height.length-1;
        int maxa = 0;
        while(i<j){
            int currenta = Math.min(height[i],height[j])*(j-i);
            maxa = Math.max(maxa,currenta);

            if(height[i]<height[j]) {
                i++;
            }else{
                j--;
            }
        }
        return maxa;
    }
}
