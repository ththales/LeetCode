class Solution {
    public static int maxProfit(int[] prices) {
    	int len = prices.length;
    	int min = Integer.MAX_VALUE;
    	int profit = 0;
    	for(int i=0; i<len; i++) {
    		if(prices[i]<min) {
    			min = prices[i];
    		}
    		else {
    			int newProfit = prices[i]-min;
    			if(newProfit>profit) {
    				profit = newProfit;
    			}
    		}
    	}
    	return profit;
    }
}