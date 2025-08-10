package basics;
import java.util.HashMap;
import java.util.Map;
public class HMap {
	public static void main(String [] args) {
		HashMap <Integer,String> s=new HashMap<>();
		s.put(22,"Mercy");
		s.put(18,"Chithu");
		s.put(4,"Kailash");
		s.put(1,"Adhi");
		s.put(4,"AlaguKailash");// last update value is allowed
    	System.out.println(s.get(18));
    	System.out.println(s.get(28));
    	System.out.println(s);
    	System.out.println(s.getOrDefault(18, "Not available"));
    	System.out.println(s.getOrDefault(11, "Not available"));
    	System.out.println(s.keySet());
    	System.out.println(s.values());
    	System.out.println(s.entrySet());
    	for (int i: s.keySet()) {
    		System.out.println(i);
    	}
    	for (String st: s.values()) {
    		System.out.println(st);
    	}
    	for(Map.Entry<Integer,String> i:s.entrySet()) {
         System.out.println(i.getKey()+" : "+i.getValue());
    	}
      System.out.println(s.containsValue(1));
	}
}


