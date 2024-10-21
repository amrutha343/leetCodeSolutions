/**
 * This solution is created out of the hint provided by leetcode. The core logic is
 * to keep one value constant. Now the remaining logic becomes similar to two sum problem.
 * Here the code is implemented using single while loops. 
 * The time complexity of this algorithm is O(n^2), where n is the number of elements 
 * in the input array. This is because we are sorting the array in O(nlogn) time and 
 * then iterating through the array with two pointers in O(n) time.
 * The space complexity is O(n) because we are using a list to store the final result,
 * which can potentially have a size of O(n) in the worst case scenario where all 
 * elements in the input array satisfy the condition for a valid triplet.
 * 311 / 313 testcases passed in leetcode.
 */
package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

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
    	System.out.println("\n");
    	List<List<Integer>> finalList = new ArrayList<>();
    	int k = 0;
    	int i=k+1;
    	int j=nums.length-1;
    	
    		while(i<j) {
    			if(nums[i]+nums[j]+nums[k]==0 ) {
    				List<Integer> tmp = new ArrayList<>();
    				tmp.add(nums[k]);
    				tmp.add(nums[i]);
    				tmp.add(nums[j]); 
    				if(!finalList.contains(tmp))
    					finalList.add(tmp);
    				i+=1;
    				j-=1;
    			}
    			else if(nums[i]+nums[j]+nums[k]>0) {
    				j-=1;
    			}else {
    				i+=1;
    			}
    			if(i>=j) {
    				k+=1;
    				i = k+1;
    	    		j=nums.length-1;
    			}
    		}
        return finalList;
    }
}

