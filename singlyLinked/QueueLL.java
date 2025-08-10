package singlyLinked;

public class QueueLL {
	Node front=null;
	Node tail=null;
	void add(int data) {
		Node newNode=new Node(data);
		if(front==null&&tail==null) {
			front=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	int poll() {
		if(front==null) {
			return Integer.MIN_VALUE;
		}
	int ret=front.data;
		if(front==tail) {
			front=tail=null;
			return ret;
		}
     front=front.next;
     return ret;
     
	}
}
