package recurs;

public class PrintNumtoN {
	/*void forward(int n) {

		if(n==1) {

		System.out.println(n);

		return;

		}

		forward(n-1);	

		System.out.println(n);

	}

	public static void main(String[] args) {

		PrintNumToN p=new PrintNumToN();

		p.forward(10);

	}
	}// using rec numto no

*/
	/*void forward(int n) {
		if(n==1) {
		System.out.println(n);
		return;}

		System.out.println(n);
		forward(n-1);

	}

	public static void main(String[] args) {

		PrintNumtoN p=new PrintNumtoN();

		p.forward(5);

	}
}*/
	void factor(int n,int i) {
		if(n%i==1) {
		System.out.println(i);

		}
       if(n!=i) {
	   factor(n,i+1);

	    }
	  }

	  public static void main(String[] args) {

		PrintNumtoN p=new PrintNumtoN();

		p.factor(25,1);

	}

}
