package JOffer.J63_股票的最大利润;

/**
 * @author Aduner
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int cost=Integer.MAX_VALUE;
        int profit=0;
        for(int price :prices){
            cost=Integer.min(cost,price);
            profit=Integer.max(profit,price-cost);
        }
        return profit;
    }
}
