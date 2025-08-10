package singlyLinked;
public class QueueDriver {
	public static void main(String[] args) {
		QueueLL q=new QueueLL();
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(3);
		int val=q.poll();
		System.out.println((val==Integer.MIN_VALUE)?"UnderFlow":val);
		val=q.poll();
		System.out.println((val==Integer.MIN_VALUE)?"UnderFlow":val);
		val=q.poll();
		System.out.println((val==Integer.MIN_VALUE)?"UnderFlow":val);
		val=q.poll();
		System.out.println((val==Integer.MIN_VALUE)?"UnderFlow":val);
		val=q.poll();
		System.out.println((val==Integer.MIN_VALUE)?"UnderFlow":val);
		val=q.poll();
		System.out.println((val==Integer.MIN_VALUE)?"UnderFlow":val);
	}
}

