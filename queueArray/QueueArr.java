package queueArray;

public class QueueArr {
int capacity=5;
int front=-1;
int rear=-1;
String q[]=new String[capacity];

void add(String st) {
	if(rear==capacity-1) {
		System.out.println("Queue Overflow");
		return;
	}
	if(rear==-1) {
		front=0;
	}
	q[++rear]=st;
	return;
  }
String poll() {
	if(front==-1) {
		return null;
	}
	String ret=q[front];
	if(front==rear) {
		front=rear=-1;
		return ret;
	}
	front++;
	return ret;
}

}
