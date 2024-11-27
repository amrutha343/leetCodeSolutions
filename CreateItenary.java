/*
* This is not a leetcode but a simple question asked on an itenary creation. The request was simple. Flight connections are only through the below paths
"Chennai","Bangalore", "Bombay","Delhi", "Goa","Chennai", "Delhi","Goa". The code should map these and provide the straighforward way to travel.
This is the solution based on first try. it is unnecesarily complex. 
The provided Java code defines a program that constructs a path based on a mapping of locations using a HashMap and a Stack. Here's an analysis
of the time and space complexity:

**Time Complexity:**
1. **Building the HashMap:** The time complexity for inserting elements into the HashMap is O(1) on average for each insertion. 

Since there are 4 entries being added, this part takes O(4) which simplifies to O(1) as it is a constant.
2. **Finding the starting point:** The first loop iterates over the keys of the HashMap to find a starting point (a key that does not 
appear as a value in the map). In the worst case, this loop runs through all keys, which is O(n), where n is the number of entries in the map.
3. **Constructing the path:** The second loop attempts to construct the path by calling `getKeyByValue` repeatedly. The `getKeyByValue`
method itself iterates through all keys in the map to find a matching value. This method has a time complexity of O(n). Since this loop 
can run up to n times (in the worst case), the overall complexity for this part is O(n^2).
4. **Popping from the Stack:** The while loop that pops from the stack runs in O(n) time, as it will pop all elements that were pushed onto the stack.
Combining these, the overall time complexity of the `getPath` method is O(n^2) due to the nested nature of the loops and the calls to `getKeyByValue`.
**Space Complexity:**
1. **HashMap Storage:** The HashMap stores n entries, which contributes O(n) space complexity.
2. **Stack Storage:** The Stack can also store up to n entries in the worst case, contributing another O(n) space complexity.
3. **Other Variables:** The space used by other variables (like strings and integers) is negligible compared to the space used by the HashMap and Stack.
Thus, the overall space complexity of the program is O(n), where n is the number of locations in the HashMap. 
In summary, the time complexity is O(n^2) and the space complexity is O(n).
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Map<String, String> location = new HashMap<>();
      location.put("Chennai","Bangalore");
      location.put("Bombay","Delhi");
      location.put("Goa","Chennai");
      location.put("Delhi","Goa");
      
      Solution s = new Solution();
      s.getPath(location);
  }
}

public class Solution{
  static String newVal = "";
  public void getPath(Map<String,String> layout){
    String str = "";
    
    Stack<String> stk = new Stack<>();
    
    for(String key : layout.keySet()){
      if(!layout.containsKey(layout.get(key))){
         str = key+" to "+layout.get(key);
         stk.push(str);
         newVal = key;
         }
      }
    for(int i =0;i<layout.size()-1;i++){
      str = getKeyByValue(layout,newVal);
      if(str.equals("NOTFOUND")){
        break;
      }else{
      stk.push(str.substring(0,str.indexOf(":")));
      newVal=str.substring(str.indexOf(":")+1);
      }
    }
    while(!stk.isEmpty()){
      System.out.println(stk.pop());
    }
  }
    public String getKeyByValue(Map<String,String> layout, String newVal){
      String str = "NOTFOUND";
      for(String k :layout.keySet()){
        if(layout.get(k).equals(newVal)){
          str = k+" to "+layout.get(k)+ ":"+k;
        }
      }
      return str;
    }
}
