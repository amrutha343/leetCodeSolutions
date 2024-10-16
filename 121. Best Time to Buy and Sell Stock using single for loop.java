/**
* As the core logic of this problem is the fact that days cannot reverse back, I am using a for loop to traverse through the price list.
* As we go, I keep a track of the smallest value which will be the day I buy the stock. Which means my profit will now solely depend on the
* remaining array values. Therefore, I keep checking the profit by subtracting current price to minimal purchase price till the end.
* The highest profit will be the value which I will return.
* Runtime 2 ms Beats 76.12% 
* Memory 62.06MB Beats 11.77%
* Time Complexity = O(N)
* Space Complexity = O(1)
*/
package com.array;

public class Hello {
	public static void main(String args[]) 
	 { 
		 int[] prices = {1,2};
		 Solution s = new Solution();
		 System.out.println("Highest profit is = "+s.maxProfit(prices));
	 } 
}
class Solution {
    public int maxProfit(int[] prices) {
    	int buyPrice = Integer.MAX_VALUE;
    	int profit = 0;
      
    	for(int i=0;i<prices.length;i++) {
    		if(buyPrice>prices[i])
    			buyPrice = prices[i];
    		if(profit<prices[i]-buyPrice && profit!=prices[i]){
    			profit = prices[i]-buyPrice;
    		}
    	}
    	
        return profit;
    }
}
