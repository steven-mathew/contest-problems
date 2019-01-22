import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UDG {
	static class Edge {
		int des;
		
		Edge(int des) {
			this.des = des;
		}	
	}
	
	static class Vertex {
		int n;
		int paths;
		
		Vertex(int n) {
			this.n = n;
		}
	}
	
	private static int n = 7;
	private static int s = 4, t = 2;
	private static LinkedList<Vertex>[] adj = new LinkedList[n];
	
	private static boolean[] vis = new boolean[n];

	public static void main(String[] args) {		
		for (int i = 0; i < n; i++) adj[i] = new LinkedList<>();
		
		// define graph
//		addEdge(new Vertex(1,0),new Vertex(2,0));
//		addEdge(new Vertex(1,0),new Vertex(3,0));
//		addEdge(new Vertex(2,0),new Vertex(4,0));
//		addEdge(new Vertex(3,0),new Vertex(2,0));
//		addEdge(new Vertex(3,0),new Vertex(4,0));

		addEdge(new Vertex(0),new Vertex(1));
		addEdge(new Vertex(1),new Vertex(2));
		addEdge(new Vertex(1),new Vertex(3));
		addEdge(new Vertex(3),new Vertex(2));
		addEdge(new Vertex(1),new Vertex(4));
		addEdge(new Vertex(4),new Vertex(2));
		addEdge(new Vertex(4),new Vertex(5));
		addEdge(new Vertex(5),new Vertex(2));
		addEdge(new Vertex(6),new Vertex(2));
	
		Queue<Integer> q = new LinkedList<>();
		
		System.out.println(sp(new Vertex(0), new Vertex(2)));	
	}
	
	public static int paths = 0;
	
	public static int sp(Vertex u, Vertex v) {
		if (u.n == v.n) {
			return 1;
		} else if (paths != 0) {
			return u.paths;
		} else {
			for (Vertex w : adj[u.n]) {
				u.paths += sp(w, v);
			}
			
			return u.paths;
		}	
	}

	public static void addEdge(Vertex u, Vertex v) {
		adj[u.n].add(v);
	}

}
