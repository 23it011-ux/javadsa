package basics2;
import java.util.ArrayList;

import java.util.Queue;

import java.util.LinkedList;

public class AdjList {


	ArrayList<ArrayList<Integer>> adLi=new ArrayList<>();

	AdjList(int v){

	for(int i=0;i<v;i++) {

	adLi.add(new ArrayList<>());

	}

	}

	public void addEdge(int u, int v) {

	adLi.get(u).add(v);

	adLi.get(v).add(u);

	}

	public void printList() {

	for(int i=0;i<adLi.size();i++) {

	System.out.println("Vertex :" + i);

	for(int j=0;j<adLi.get(i).size();j++) {

	System.out.print(adLi.get(i).get(j)+" ");

	}

	System.out.println();

	}

	}

	public void BFS(int v) {

	System.out.println("BFS: ");

	int totalV=adLi.size();

	boolean visited []=new boolean[totalV];

	visited[v]=true;

	Queue<Integer> q=new LinkedList<>();

	q.offer(v);

	while(!q.isEmpty()) {

	int vertex=q.remove();

	System.out.print(vertex+" ");

	for(int i=0;i<adLi.get(vertex).size();i++) {

	int av=adLi.get(vertex).get(i);

	if(!visited[av]) {

	q.add(av);

	visited[av]=true;

	}

	}

	}

	}

	public void DFS(int v) {

	System.out.println("\nDFS: ");

	int totalV=adLi.size();

	boolean visited[]=new boolean[totalV];

	dfs2(v,visited);

	}

	void dfs2(int v,boolean [] visited) {

	visited[v]=true;

	System.out.print(v+" ");

	for(int i=0;i<adLi.get(v).size();i++) {

	int av=adLi.get(v).get(i);

	if(!visited[av]) {

	dfs2(av,visited);

      	}
	   }
	 }
	}

