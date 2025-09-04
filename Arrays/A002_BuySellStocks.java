package Arrays;

public class A002_BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit2(prices));
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
    public static int maxProfit2(int[] prices) {
        int profit = 0;
        int bestBuy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] > bestBuy){
                profit = Math.max(profit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return profit;
    }
}
