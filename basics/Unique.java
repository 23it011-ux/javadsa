package basics;
import java.util.HashMap;
import java.util.Map;
public class Unique {
	public static void main(String[] args) {
        HashMap<Character, Integer> s = new HashMap<>();
        String st = "Java is a programming language";

        for (char ch : st.toCharArray()) {
            s.put(ch, s.getOrDefault(ch, 0) + 1);
        }
      for(Map.Entry<Character,Integer> i:s.entrySet()) {
    	  if(i.getValue()==1) {
    		  System.out.println(i.getKey());
    	  }
      }    }
}

