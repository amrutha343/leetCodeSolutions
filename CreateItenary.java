
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
