package stackarr;

public class StackDriver {
  public static void main(String[] args) {
	  Stack st = new Stack();
	  System.out.println(st.capacity);
	  st.push("Aravind");
	  st.push("Aathi");
	  st.push("Surendhar");
	  st.push("Dharshan");
	  st.push("Aswin");
	  st.push("Abdhul");
    System.out.println((st.peek()==null)?"Underflow":st.peek());
    String res=st.pop();
    System.out.println((res==null)?"Underflow":res);
    res=st.pop();
    System.out.println((res==null)?"Underflow":res);
  }
}
