package basics;

public class Wrapper {
     public static void main(String args[]) {
    	 //autoboxing
    	 int num=121;
    	 Integer n=num;
    	 String st =Integer.toString(n);
    	 StringBuilder sb=new StringBuilder(st);
    	 
    	 //unboxing
    	 Integer ret=Integer.parseInt(st);
    	 int res=ret.intValue();
    	 System.out.println(res);
    	 
    	 /*sb.reverse();
    	 String res=sb.toString();
    	 System.out.println((st.equals(res)?"Palindrome":"Not a palindrome"));
    	 */
    	 }
}

