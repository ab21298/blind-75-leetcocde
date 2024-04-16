package Arrays;

public class A002_BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            int temp = prices[i] - min;
            if(temp > profit) profit = temp;
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}
