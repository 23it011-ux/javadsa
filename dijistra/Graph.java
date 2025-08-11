package dijistra;

import java.util.Arrays;

import java.util.PriorityQueue;

import java.util.Comparator;

import java.util.List;

import java.util.ArrayList;
class Edge {
    int destination, weight;
    Edge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}
class Graph {
    int totalV;
    List<List<Edge>> adjList;
    Graph(int totalV) {
        this.totalV = totalV;
        adjList = new ArrayList<>();
        for (int i = 0; i < totalV; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge(dest, weight));
        adjList.get(dest).add(new Edge(src, weight)); // Undirected Graph
    }
    void dijkstra(int src) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        int[] dist = new int[totalV];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.offer(new Edge(src, 0));
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int u = current.destination;
            System.out.println(u);
            for (Edge neighbor : adjList.get(u)) {
                int v = neighbor.destination;
                int weight = neighbor.weight;
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Edge(v, dist[v]));
                }
            }
            System.out.println(Arrays.toString(dist));
        }
        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < totalV; i++) {
            System.out.println("To node " + i + " -> Distance: " + dist[i]);
        }
    }
}

