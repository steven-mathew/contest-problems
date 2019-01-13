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
		
//		vis[s] = true;
//		q.add(s);
//		
//		int cnt = 0;
//
//		
//		while (!q.isEmpty()) {
//			int cur = q.poll();
//
//			System.out.println("\n" + cur);
//			
//			
//			for (Edge e : adj[cur]) {
//				int next = e.des;
//
//				System.out.print(" " + next);
//
//				
//				if (!vis[next]) {
////					vis[next] = true;
//					try {
//						Thread.sleep(100);
//						if (next != 2) q.add(next);
//						else { 
//							if (cnt != 2) {
//								cnt++;
//							} else {
//								break;
//							}
//							q.add(4);
//						}
//						
//						System.out.println(" count: " + cnt);
//					} catch (InterruptedException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//			}
//		}
//		
//		System.out.println(vis[t]);

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
//				System.out.println(u + " " + w.n);
				u.paths += sp(w, v);
				
//				else {					
					
//					
//					if (adj[w.n].size() >= 1) {
//						u.paths += adj[u.n].size();						
//					} else {
//
//					}
				
					
					
//					else {
//				u.paths += adj[u.n].size() + 1;
//					}
					
					
//					u.paths -= sp(w, v) - adj[w.n].size() - v.paths + 1;
					
//					u.paths -= adj[u.n].size() - u.paths - 1;
//					if (adj[w.n].contains(v)) {
////						u.paths += adj[u.n].size() - u.paths - v.paths - 1;
//					} 
//					if w contains u.. add 1?
//				}
				
				// if u conntected to v, add 1

				// if u is connected to w, u.vis = false
			}
			
			return u.paths;
		}	
	}

	public static void addEdge(Vertex u, Vertex v) {
		adj[u.n].add(v);
	}

}
