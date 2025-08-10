package doublyll;
 class Doubly1 {
 int data;
 Doubly1 next;
 Doubly1 prev;
}
class process extends Doubly1{
	Doubly1 head;
	Doubly1 tail;
	void insertBegin(int data) {
		Doubly1 newnode = new Doubly1();
		newnode.data=data;
		newnode.next=next;
		newnode.prev=prev;
		if(head== null)
		{
			head=newnode;
			tail=newnode;
		}
		else {
			head.prev=newnode;// insert at begin
			newnode.next=head;
			head=newnode;
		}
	}
		void insertEnd(int data) {
			Doubly1 newnode = new Doubly1();
			newnode.data=data;
			newnode.next=next;
			newnode.prev=prev;
			if(head== null)
			{
				head=newnode;
				tail=newnode;
			}
		else {                
			tail.next=newnode;//insert at end
			newnode .prev=tail;
			tail=newnode;
		}
	}
		/*void insertPos(int data,int pos) {
			int count=1;
			if(pos==0) {
				insertBegin(data);
				return;
			}
			Doubly1 temp=head;
			while(temp!=null) {
				if(count==pos) {
					Doubly1 newnode = new Doubly1();
					newnode.next=temp.next;
					temp.next.prev=newnode;
					temp.next=newnode;
					newnode.prev=temp;
					return;	
				}count++;
			}
		}*/void insertPos(int data,int pos) {
			Doubly1 newnode = new Doubly1();
			newnode.data=data;
			newnode.next=next;
			newnode.prev=prev;
			if(head== null)
			{
				head=newnode;
				tail=newnode;
			}
		else {                
			Doubly1 temp=head;
			for(int i=1;i<=pos-1;i++) {
				temp=temp.next;
			}
			temp.next.prev=newnode;
			newnode.next=temp.next;
			temp.next=newnode;
			newnode.prev=temp;
		}
		}
		void deleteBegin() {
			Doubly1 temp=head;
			if(head==null) {
				System.out.println("Empty");
			}
			else {
				temp.next.prev=null;
				head=head.next;
			}
		}
		void deleteEnd() {
			Doubly1 temp=head;
			if(head==null) {
				System.out.println("Empty");
			}
			else {
				tail=tail.prev;
				tail.next.prev=null;
				tail.next=null;
			}
		}
		void deletesPos(int pos) {
			Doubly1 temp=head;
			Doubly1 prev=null;
			if(head==null) {
				System.out.println("empty");
			}else {
				for(int i=1;i<=pos;i++) {
					prev=temp;
					temp=temp.next;
				}
				temp.next.prev=prev;
				prev.next=temp.next;
				temp.next=null;
				temp.prev=null;
			}
		}
		void search(int key) {
			Doubly1 temp=head;
			int pos=0;
			boolean found=false;
			while(temp!=null) {
				if(temp.data==key) {
					System.out.println("Element"+key+"found at position "+pos);
					found=true;
					break;
				}
				temp=temp.next;
				pos++;
			}
			if(!found) {
				System.out.println("Element"+key+"not found in the position "+pos);
			}
		}
	void display() {
	Doubly1 temp=new Doubly1();
	temp=head;
	while(temp !=null ) {
		System.out.println(temp.data);
		temp=temp.next;
		}
	}
void revdisplay() {
		Doubly1 temp=new Doubly1();
		temp = tail;
		while(temp !=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
    }	
}

public class Doubly extends process{
	public static void main (String [] args) {
		Doubly d=new Doubly();
		d.insertBegin(1);
		d.insertBegin(2);
		d.insertBegin(3);
		d.insertEnd(5);
		d.revdisplay();
		d.deleteBegin();
		d.display();
		d.search(3);
	}
	
}
