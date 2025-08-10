package circular;
class cirNode {
     int data;
     cirNode next;
}
class code extends cirNode{
	cirNode head=null;	

void insertBegin(int data) {
	cirNode newnode = new cirNode();
	newnode.data=data;
	newnode.next=null;
	if(head==null) {
		head=newnode;
		newnode.next=head;
	}
	else {
		cirNode temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.next=head;
		head=newnode;
	}
}
void insertEnd(int data) {
	cirNode newnode=new cirNode();
      newnode.data=data;
      newnode.next=null;
      if(head==null) {
    	  head=newnode;
    	  newnode.next=head;
      }
	else {
    	  cirNode temp=head;
    	  while(temp!=head) {
    		  temp=temp.next;
    	  }
    	  newnode.next=head;
    	  temp.next=newnode;
      }
	}
void insert_at_position(int data,int position) {
	cirNode temp=head;
	cirNode newnode =new cirNode() ;
	newnode.data=data;
	if(position==0) {
		insertBegin(data);
	}
	if(temp.next==head) {
		insertEnd(data);
	}else {
		newnode.next=temp.next;
		temp.next=newnode;
	
	}
	int i;
	for(i=1;i<position&&temp.next!=head;i++) {
		temp=temp.next;
	}
	}
void deleteBegin() {
	if(head==null) {
		System.out.println("empty");
	}
	cirNode temp=head;
	while(temp.next!=head) {
		temp=temp.next;
		return;
	}
	head=head.next;
	temp.next=head;
}
void deleteEnd() {
	cirNode temp=head;
	while(temp.next.next!=head) {
		temp=temp.next;
	}temp.next=head;
}
void display() {
	cirNode temp=head;
	while(temp.next!=head) {
		System.out.println(temp.data);
		temp=temp.next;
	}
	System.out.println(temp.data);
}
}
public class CircL{
	public static void main(String []args) {
	code d=new code();
	 d.insertBegin(1);
	 d.insertEnd(2);
	 d.display();		
		
	}
}





