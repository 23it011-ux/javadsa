package basics;
import java.util.HashSet;
public class Set {
		public static void main(String [] args) {
			HashSet <String> s=new HashSet<>();
			s.add("Indhumathi");// not alowed duplicate
	    	s.add("Indhumathi");
	    	s.add("Bharathi");
	    	s.add("Thanuja");
	    	s.add("Brindha");
	    	s.add("Kowsi");
	    	System.out.println(s);
	    	System.out.println(s.remove("Indhumathi"));
	    	System.out.println(s);


		}

	}


