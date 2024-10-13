/**
* This code uses an integer array of size 26 which represents Alphabets. 
* Everytime a character is encontered, we increase the count of that alphabet 
* position in the array in the first string. For the second string, we decrease 
* the count for every encounter we have. If the array end up with all 0, it is an anagram.
* Runtime 2ms Beats 97.87% 
* Memory 43.39MB Beats 65.38%
* The time complexity of this solution is O(n), where n is the length of the input strings s and t. 
* This is because we iterate through both strings once to populate the character set array and then iterate through it again to check if all values are zero.
* The space complexity is O(1) because the character set array has a fixed size of 26, regardless of the input size.
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
    	int[] charSet = new int[26];
    	for(char ch : s.toCharArray()) {
    		charSet[ch - 'a']++;
    	}
    	for(char ch : t.toCharArray()) {
    		charSet[ch - 'a']--;
    	}
    	for(int i=0;i<25;i++) {
    		if(charSet[i]!=0)
    			return false;
    	}    	
        return true;
    }
}
 
