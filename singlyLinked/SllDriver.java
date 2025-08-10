package singlyLinked;

public class SllDriver {

		public static void main(String[] args) {

			SinglyLL sll=new SinglyLL();

			sll.display();

			sll.inBegin(25);

			sll.inBegin(5);

			sll.display();
            sll.atEnd(7);
            sll.display();
            sll.sort();
            sll.display();
            }
	}
