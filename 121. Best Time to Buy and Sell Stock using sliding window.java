/**
* This solution is inspired by https://evan-soohoo.medium.com/repeat-code-with-leetcode-best-time-to-buy-and-sell-stock-ad8e491b5357
* Sliding window concept is used here to find the solution. The date to puchase the stock is tagged as today and will be changed to 
* another day only if we find we may get a better price we can sell the stock on tomorrow date which is shifted every loop.
* Runtime 2ms Beats 76.19% 
* Memory 62.07 MB Beats 11.80%
* The time complexity of this solution is O(n) where n is the number of elements in the prices array.
*  This is because we iterate through the array once to calculate the maximum profit
*  The space complexity is O(1) because we are using a constant amount of extra space regardless of the input size.
*/
package com.array;

public class Hello {
	public static void main(String args[]) 
	 { 
		 int[] prices = {7,1,5,3,6,4};
		 Solution s = new Solution();
		 System.out.println("Highest profit is = "+s.maxProfit(prices));
	 } 
}
class Solution {
    public int maxProfit(int[] prices) {
    	int today = 0;
    	int tomorrow = 1;
    	int profit = 0;
    	while(tomorrow<prices.length) {
    		
    		if(prices[tomorrow]-prices[today]>0) {
    			System.out.println(today+"  "+tomorrow+" "+profit);
    			profit=Math.max(profit, prices[tomorrow]-prices[today]);
    		}
    		else {
    			System.out.println(today+"  "+tomorrow+" "+profit);
    			today=tomorrow;
    		}
    		tomorrow+=1;
    	}
      
    	
        return profit;
    }
}
