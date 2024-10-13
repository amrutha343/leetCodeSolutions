/**
* I have used Sorting technique to identify if the strings are anagram or not.
* Both the strings are converted into Character Arrays so that we can use the inbuilt sort method of Arrays class to sort them.
* Runtime 3ms Beats 89.97%
* Memory 44.54MB Beats 38.37%
* The time complexity of this solution is O(n log n), where n is the length of the input strings s and t. This is because the 
* sorting of the character arrays takes O(n log n) time complexity
* The space complexity of this solution is O(n), where n is the length of the input strings s and t. This is because we are 
* creating character arrays of length n to store the sorted versions of the input strings.
*/
package com.helloworld;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HelloWorld {

	/* Driver program to test above functions */
	 public static void main(String args[]) 
	 { 
		 Solution s = new Solution();
		 String st = "cchhac";
		 String t = "ccac";
		 System.out.println(s.isAnagram(st, t));
	 } 
}

class Solution {
    public boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length())
    		return false;
    	char[] str1 = s.toCharArray();
    	char[] str2 = t.toCharArray();
    	Arrays.sort(str1);
    	Arrays.sort(str2);
    	for(int i=0;i<str1.length;i++) {
    		if(str1[i]!=str2[i]){
    			return false;
    		}
    	}
        return true;
    }
}
 
