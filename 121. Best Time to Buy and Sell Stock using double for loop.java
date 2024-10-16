/**
 * Disclaimer - This is a very bad and highly inefficient logic.
 * The time complexity of the given solution is O(n^2) because we have two nested loops iterating over the prices array.
 *  The space complexity is O(1) because we are not using any extra space that grows with the input size. 
 * This solution explores all possible pairs of buying and selling days to calculate the maximum profit. 
 * While it is a straightforward approach, it is not efficient for large input sizes due to its quadratic time complexity.  
 * A more efficient solution can be achieved with a single pass through the array, keeping 
 * track of the minimum price seen so far and updating the maximum profit accordingly. 
 * This approach would have a time complexity of O(n) and would be more suitable for larger input sizes.
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
    	int profit = 0;
    	for(int i =0;i<prices.length-1;i++) {
    		for (int j=i+1;j<prices.length;j++) {
    			profit = Math.max(profit, prices[j]-prices[i]);
    		}
    	}
    	
        return profit;
    }
}
