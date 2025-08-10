package singlyLinked;

public class Stack {
	Node top=null;	

	void push(int data) {

		Node newNode=new Node(data);

		newNode.next=top;

		top=newNode;	

	}

	int pop() {

		if(top==null){ 

			return '\0';

		}

		int temp=top.data;

		top=top.next;

		return temp;		

	}

	int peek() {

		if(top==null){ 

			return '\0';

		}

		return top.data;

	}

	int size() {

		if(top==null) {

			return 0;

		}

		int count=0;

		Node current=top;

		while(current!=null) {

			count++;

			current=current.next;

		}

		return count;					

		}

	}