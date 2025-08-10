package doubleEndQueue;

public class DequeueDriver {
public static void main(String [] args) {
	DoubleEndQ cq=new DoubleEndQ();
	cq.add("IndhuMathi");
	cq.add("Bharathi");
	cq.addFirst("Dharani");
	cq.addFirst("Brindhasri");
	cq.add("Kamali");
	cq.add("Thanuja");
	cq.add("Kowsi");
	String data=cq.poll();
	System.out.println((data==null)?"Underflow":data);
    data=cq.pollLast();
	System.out.println((data==null)?"Underflow":data);
}
}
