//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Best Time to Buy and Sell Stock using DP

public class BestTimeToSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};

        int minPrice= Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(maxProfit<prices[i]-minPrice){
                maxProfit=prices[i]-minPrice;

            }
        }
      System.out.println(maxProfit);
    }
}
