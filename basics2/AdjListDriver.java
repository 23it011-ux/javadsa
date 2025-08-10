package basics2;

public class AdjListDriver {

		public static void main(String[] args) {

		AdjList al=new AdjList(8);

		al.addEdge(0, 1);

		        al.addEdge(0, 4);

		        al.addEdge(0, 6);

		        al.addEdge(1, 2);

		        al.addEdge(1, 5);

		        al.addEdge(1, 7);

		        al.addEdge(2, 7);

		        al.addEdge(3, 2);

		        al.addEdge(4, 5);

		        al.addEdge(4, 3);

		        al.printList();

		        al.BFS(0);

		        al.DFS(0);

		}

		}




