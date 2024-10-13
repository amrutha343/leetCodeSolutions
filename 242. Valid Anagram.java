/*
* This logic was created using HashMap as it has a capability to store key value pairs without repetition.
* Runtime 21ms Beats 10.90% 
* Time Complexity O(N)
* Memory 44.22 MB Beats 57.76%
* Space Complexity O(N)
*/
package com.helloworld;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HelloWorld {

	/* Driver program to test above functions */
	 public static void main(String args[]) 
	 { 
		 Solution s = new Solution();
		 String st = "ccac";
		 String t = "ccac";
		 System.out.println(s.isAnagram(st, t));
	 } 
}

class Solution {
    public boolean isAnagram(String s, String t) {
    	int count =0;
        Map<Character,Integer> anagramMap = new HashMap<>();
        if(s.length()!=t.length()) {
        	return false;
        }
        for(int i=0;i<s.length();i++) {
        	if(anagramMap.containsKey(s.charAt(i))) {
        		anagramMap.put(s.charAt(i),anagramMap.get(s.charAt(i))+1);
        	}else {
        		anagramMap.put(s.charAt(i),1);
        	}
        	System.out.println(anagramMap);
        }
        for(int i=0;i<t.length();i++) {
        	if(anagramMap.containsKey(t.charAt(i))) {
        		anagramMap.put(t.charAt(i),anagramMap.get(s.charAt(i))-1);
        	}else {
        		return false;
        	}
        	System.out.println(anagramMap);
        }
        Set<Character> anagramSet = new HashSet<>();
        anagramSet = anagramMap.keySet();
        
        for(Character key:anagramSet) {
        	if(anagramMap.get(key)!=0) {
        		return false;
        	}
        }
        return true;
    }
}
 
