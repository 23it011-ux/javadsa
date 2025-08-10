package singlyLinked;

public class StackDriver {
	public static void main(String[] args) {

		Stack st=new Stack();

		st.push(10);

		st.push(20);

		st.push(30);

		st.push(40);

		int val=st.pop();

		System.out.println((val==Integer.MIN_VALUE)?"Stack UnderFlow":+val);

		val=st.pop();

		System.out.println((val==Integer.MIN_VALUE)?"Stack UnderFlow":+val);

		val=st.pop();

		System.out.println((val==Integer.MIN_VALUE)?"Stack UnderFlow":+val);

		val=st.pop();

		System.out.println((val==Integer.MIN_VALUE)?"Stack UnderFlow":+val);

		val=st.peek();

		System.out.println((val==Integer.MIN_VALUE)?"Stack UnderFlow":+val);

	}



	}

