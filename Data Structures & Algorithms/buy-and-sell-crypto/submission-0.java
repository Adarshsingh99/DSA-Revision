class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int n = prices.length;
        for(int i=0;i<n;i++)
        {
            int buy = prices[i];
            for(int j=i+1;j<n;j++)
            {
                if(prices[j]>buy)
                {
                    profit = Math.max(profit,prices[j]-buy);
                }
            }
        }
        return profit;
    }
}
