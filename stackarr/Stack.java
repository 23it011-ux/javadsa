package stackarr;

public class Stack {
   int capacity = 5;
   int top=-1;
   String arr[]=new String [capacity];
   
   void push(String data) {
	   if(top>=capacity-1) {
		   System.out.println("Stack overflow");
		   return;
	   }
	   arr[++top]=data;
   }
   String pop() {
	   if(top<=-1) {
		   return null;
	   }
	  return arr[top--]; 
   }
   String peek() {
	   if(top<=-1) {
		   return null;
	   }
	  return arr[top]; 
   }
   int size() {
	   return top+1;
   }
   boolean isEmpty() {
	   if(top==-1) {
		   return true;
	   }
	   return false;
   }
}
