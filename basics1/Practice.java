package basics1;
import java.util.Vector;

public class Practice {
public static void main(String [] args) {
	Vector <Integer> v=new Vector<>();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	System.out.println(v.get(1));
	System.out.println(v.capacity());
	System.out.println(v.size());
}
}
