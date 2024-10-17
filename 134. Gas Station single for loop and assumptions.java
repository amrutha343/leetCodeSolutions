/**
 * This logic is based on the prime assumption that "If there exists a solution, it is guaranteed to be unique."
 * We are checking whether we have enough fuel and cost at first by getting the difference between the sum of cost and gas.
 * As long as the difference is greater than 0, we know there is a solution.
 * The next case is to find out the starting point. If gas sum is greater than cost, we know we have a solution. 
 * The solution can be found by getting the difference of each gas and cost and checking if they are greater. once greater, we have a starting.
 * Runtime 9ms Beats 7.67%
 * Memory 56.76 MB Beats 14.45%
 * The time complexity of this solution is O(n) where n is the number of elements in the gas and cost arrays. 
 * This is because we iterate through the arrays only once to calculate the total gas and cost sums, and then
 *  iterate through the arrays again to find the starting point. 
 *  The space complexity is O(1) because we are using a constant amount of extra space regardless of the input size.
 *  Please note - this code will not work if assumption of unique answer changes. 
*/
package com.array;

import java.util.Arrays;

public class Hello {
	public static void main(String args[]) 
	 { 
		 int[] gas = {1,2,3,4,5};
		 int[] cost = {3,4,5,1,2};
		 Solution s = new Solution();
		 System.out.println("Starting point is = "+s.canCompleteCircuit(gas,cost));
	 } 
}
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int tank = 0;
       int starting = 0;
       int gasSum = Arrays.stream(gas).sum();
       int costSum = Arrays.stream(cost).sum();
       if(gasSum-costSum<0)
       return -1;

       for (int i=0;i<gas.length;i++){
        tank+=gas[i]-cost[i];
        if(tank<0){
            tank=0;
            starting=i+1;
        }
        System.out.println(tank+" "+gas[i]+" "+cost[i] + "  "+i);
       }
        return starting;
    }
    
}
