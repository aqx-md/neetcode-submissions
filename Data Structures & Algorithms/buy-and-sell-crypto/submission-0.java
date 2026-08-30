class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxP=0;


        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            maxP=Math.max(maxP,prices[i]-min);
        
        }
        return maxP;
    }
}
