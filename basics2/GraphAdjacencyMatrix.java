package basics2;
import java.util.Arrays;
import java.util.ArrayDeque;
public class GraphAdjacencyMatrix {
	
	    private int[][] adjacencyMatrix; // 2D array to store graph edges
	    private int vertices;           // Number of vertices

	    // Constructor to initialize the graph
	    public GraphAdjacencyMatrix(int vertices) {
	        this.vertices = vertices;
	        adjacencyMatrix = new int[vertices][vertices];
	    }

	    // Method to add an edge
	    public void addEdge(int source, int destination) {
	        if (source >= vertices || destination >= vertices) {
	            System.out.println("Invalid vertices!");
	            return;
	        }
	        adjacencyMatrix[source][destination] = 1;
	        adjacencyMatrix[destination][source] = 1; // For undirected graph
	    }

	    // Method to display the adjacency matrix
	    public void displayMatrix() {
	        System.out.println("Adjacency Matrix:");
	        for (int[] row : adjacencyMatrix) {
	            System.out.println(Arrays.toString(row));
	        }
	    }

	    // Method to perform Breadth-First Search (BFS)
	    public void bfs(int startVertex) {
	        boolean[] visited = new boolean[vertices];
	        ArrayDeque<Integer> queue=new ArrayDeque<>();
	        visited[startVertex] = true;
	        queue.add(startVertex);
	        System.out.print("BFS Traversal: ");
	        while (!queue.isEmpty()) {
	            int currentVertex = queue.poll();
	            System.out.print(currentVertex + " ");
	            for (int i = 0; i < vertices; i++) {
	                if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
	                    visited[i] = true;
	                    queue.add(i);
	                }
	            }
	        }
	        System.out.println();
	    }

	    // Method to perform Depth-First Search (DFS)
	    public void dfs(int startVertex) {
	        boolean[] visited = new boolean[vertices];
	        System.out.print("DFS Traversal: ");
	        dfsUtil(startVertex, visited);
	        System.out.println();
	    }

	    // Utility method for DFS
	    private void dfsUtil(int vertex, boolean[] visited) {
	        visited[vertex] = true;
	        System.out.print(vertex + " ");
	        for (int i = 0; i < vertices; i++) {
	            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
	                dfsUtil(i, visited);
	            }
	        }
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        GraphAdjacencyMatrix al = new GraphAdjacencyMatrix(8); // Graph with 5 vertices

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
	        al.displayMatrix();

	        al.bfs(0); // Perform BFS starting from vertex 0
	        al.dfs(0); // Perform DFS starting from vertex 0
	    }
	}
