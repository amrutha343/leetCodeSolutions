/**
 * This solution is created out of the hint provided by leetcode. The core logic is
 * to keep one value constant. Now the remaining logic becomes similar to two sum problem.
 * Here the code is implemented using two while loops. 
 * The time complexity of this solution is O(n^2) because we have nested loops 
 * that iterate through the array of size n. The space complexity is O(n) 
 * because we are using an ArrayList to store the final result, which can potentially
 *  store up to n/3 triplets in the worst case scenario.
 *  308 / 313 testcases passed in leetcode
 */
package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {
	public static void main(String args[]) 
	 { 
		 int[] nums = {-1,0,1,2,-1,-4};
		 
		 Solution s = new Solution();
		 System.out.println("Starting point is = "+s.threeSum(nums));
	 } 
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	Arrays.stream(nums).forEach(n -> {
    		System.out.print(n+" ");
    	});
    	System.out.println("\n");
    	List<List<Integer>> finalList = new ArrayList<>();
    	int k = 0;
    	int i=0;
    	int j=0;
    	while(k<=nums.length) {
    		i = k+1;
    		j=nums.length-1;
    		while(i<j) {
    			System.out.println(nums[k]+" "+nums[i]+" "+nums[j]);
    			if(nums[i]+nums[j]+nums[k]==0 ) {
    				List<Integer> tmp = new ArrayList<>();
    				tmp.add(nums[k]);
    				tmp.add(nums[i]);
    				tmp.add(nums[j]); 
    				if(!finalList.contains(tmp))
    					finalList.add(tmp);
    				i+=1;
    				j-=1;
    				System.out.println(tmp);
    			}
    			else if(nums[i]+nums[j]+nums[k]>0) {
    				j-=1;
    			}else {
    				i+=1;
    			}
    		}
    		k+=1;	
     	}
        return finalList;
    }
}
