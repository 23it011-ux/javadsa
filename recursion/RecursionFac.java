package recursion;

public class RecursionFac {
	//factorial using loop
    int loop(int num) {
    	int fact=1;
    	for(int i=2;i<=num;i++) {
    		fact=fact*i;
    	}
    	return fact;
    }
    //factorial using recursion
    int rec(int num) {
    	if(num==1) {
    		return 1;
    	}
    	return num*rec(num-1);
    }

    public static void main(String []args) {
    	RecursionFac f=new RecursionFac();
    	int num=5;
    	System.out.println("By loop: "+f.loop(num));
    	System.out.println("By Recursion: "+f.rec(num));

    }
}
