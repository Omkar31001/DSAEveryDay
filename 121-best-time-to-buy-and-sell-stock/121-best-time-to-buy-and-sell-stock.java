class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minSoFar = prices[0];
        int n  = prices.length;
        for(int i=0;i<n;i++){
            minSoFar= Math.min(minSoFar,prices[i]);
            int profit=prices[i]-minSoFar;
            maxProfit = Math.max(profit,maxProfit);
        }
      
        return maxProfit;      
    }
            
}