package leetcode;

public class kadanealgostocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = calculateprofit(prices);
    }

    static int calculateprofit(int[] prices){
        int n = prices.length;
        int profit = 0;
        int buy = prices[0];

        for(int i=1; i<n; i++){

            if( prices[i] < buy) {
                buy = prices[i];
            }else if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }

        return profit;
    }
}
