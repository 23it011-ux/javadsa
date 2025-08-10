package basics;
import java.util.LinkedHashSet;
public class LinHashset {
	public static void main(String [] args) {
		LinkedHashSet <String> s=new LinkedHashSet<>(); // Treeset same
		s.add("Indhumathi");
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


