class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int curr = prices[0];
        for(int i=1;i<n;i++)
        {
          curr = Math.min(curr,prices[i]);
          profit = Math.max(profit , prices[i]-curr);
        }
        return profit;
    }
}
