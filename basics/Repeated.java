package basics;

import java.util.HashMap;

public class Repeated {
	public static void main(String[] args) {
        HashMap<Character, Integer> s = new HashMap<>();
        String st = "Java";

        for (char ch : st.toCharArray()) {
            s.put(ch, s.getOrDefault(ch, 0) + 1);
        }
        char rep='\0';
        int max=0;
        for(Character ch : s.keySet()) {
        	int count = s.get(ch);
        	if(count>max) {
        		max = count;
        		rep= ch;
        	}
        }
	}
	System.out.print();
}
