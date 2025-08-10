package basics;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayL {
    public static void main(String args[]) {
      ArrayList<Integer> al=new ArrayList<>(10);
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(3,50);
      al.add(20);
      System.out.println(al);
      al.remove(5);
      System.out.println(al);
      al.addFirst(90);
      System.out.println(al);
      al.set(3,-10);
      System.out.println(al);
      al.add(30);
      System.out.println(al);
      System.out.println(al.size());

      
      //iterating List
      System.out.println(al.get(3));
     //by enhanced for loop
      System.out.println("for each loop");
      for(int i:al) {
          System.out.println(i);
      }
      System.out.println("Iterating by index");
      for(int i=0;i<al.size();i++) {
          System.out.println(al.get(i));

      }
    
      //iterating class
      System.out.println("by Iterator class");
      Iterator<Integer> it=al.iterator();
      while(it.hasNext()) {
          System.out.println(it.next());
      
      }
      //lambda
      System.out.println("for each loop");
      al.forEach(num->{System.out.println(num);});
      }
      }
