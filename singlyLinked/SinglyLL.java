package singlyLinked;

public class SinglyLL {

    Node head=null;

    //insert in beginning

    void inBegin(int data){

        Node newNode=new Node(data);

        newNode.next=head;

        head=newNode;

	}

    //insert at end

    void atEnd(int data) {

    	Node newNode=new Node(data);

    	if(head==null) {

    		head=newNode;

    		return;

    	}

    	Node current=head;

    	while(current.next!=null) {

    		current=current.next;

    	}

    	current.next=newNode;

    }

    //at position

    void inPos(int data,int pos) {

    	if(head==null||pos==0) {

    		if(pos==0) {

    			inBegin(data);

    			return;

    		}

    		System.out.println("Index out of bound");

    		return; 		

    	}

    	Node current=head;

    	int cp=1;

    	while(current!=null) {

    		if(cp==pos) { 

    			Node newNode=new Node(data);

    			newNode.next=current.next;

    			current.next=newNode;

    			return;

    		}

    		current=current.next;

    		cp++;

    	}   	

    }
 // search the val
    void search(int val) {
    	if(head==null) {
    		System.out.println("ll is empty");
    		return;
    	}
    	Node current=head;
    	while(current!=null) {
    		if(current.data == val) {
    			System.out.println(val+"in the pos : "+pos);
    			return;
    		}
    		pos++;
    		current=current.next;
    	}
    	System.out.println(val+"not in the ll: "+pos);
    }

    //sorting ll by bubble sort
    void sort() {
    	if(head==null) {
    		return;
    	}
    	Node current=head;
    	boolean flag =true;
    	while(flag) {
    		flag=false;
    		while(current.next!=null) {
    			if(current.data>current.next.data) {
    				int temp= current.data;
    				current.data=current.next.data;
    				current.next.data=temp;
    				flag=true;
    			}
            current=current.next;
    		}
    	}
    }
    

	//print Element

	void display(){

		if(head==null) {

			System.out.println("Empty linked list");

			return;

		}

	    Node current=head;

	    while(current.next!=null){

	        System.out.print(current.data+ "-->");

	        current=current.next;

	    }

	    System.out.println(current.data);

	}

}



