package ex_02_Arrays;

public class P023_Buy_And_Sell_Stock_MaxProfit {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<buyPrice) // stores min value as buy price
            {
                buyPrice=prices[i];
            }
            else {
               int profit=prices[i]-buyPrice;// calculates profit based on current price
               maxProfit=Math.max(profit,maxProfit); // calculates maxprofit among all profits

            }
        }
            return maxProfit;

    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("Max Profit ="+buyAndSellStocks(prices));
    }
}
