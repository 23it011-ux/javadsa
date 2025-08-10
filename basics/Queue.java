package basics;
import java.util.Deque;
import java.util.LinkedList;//ArrayDeque (same)
public class Queue {
    public static void main(String [] args) {
    	Deque <String> q=new LinkedList<>();
    	q.add("Dharani");
    	q.add("Indhumathi");
    	q.add("Bharathi");
    	q.add("Thanuja");
    	q.add("Brindha");
    	q.add("Kowsi");
        System.out.println(q.poll());
        //q.add(1,"Acchaya");// not possible in queue// in list possible
        System.out.println(q);
        System.out.println(q.pollLast());
        System.out.println(q.isEmpty());
        System.out.println(q.contains("Indhumathi"));

        

    }
}
