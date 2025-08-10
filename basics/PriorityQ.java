package basics;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQ {
	public static void main(String [] args) {
		PriorityQueue <String> q=new PriorityQueue<>();
		q.add("Dharani");
    	q.add("Indhumathi");
    	q.add("Bharathi");
    	q.add("Thanuja");
    	q.add("Brindha");
    	q.add("Kowsi");
    	System.out.println(q.poll());
    	System.out.println(q);
	}

}
