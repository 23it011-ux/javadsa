package dijistra;

public class DijkstraDriver {

    public static void main(String[] args) {

        int totalV = 6; // Number of vertices

        Graph graph = new Graph(totalV);




        graph.addEdge(0, 1, 4);

        graph.addEdge(0, 2, 1);

        graph.addEdge(0, 3, 2);

        graph.addEdge(1, 4, 5);

        graph.addEdge(2, 4, 3);

        graph.addEdge(2, 3, 3);

        graph.addEdge(3, 5, 6);

        graph.addEdge(4, 5, 1);




        graph.dijkstra(0); // Find shortest paths from node 0

    }

}




