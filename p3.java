package newyears;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class p3 {

	static class Edge {
		int des;

		Edge(int des) {
			this.des = des;
		}	
	}

	static class Vertex {
		int n;
		
		Vertex(int n) {
			this.n = n;
		}
	}

	private static int n;
	private static int s,t;
	private static LinkedList<Vertex>[] adj = new LinkedList[n];
	private static LinkedList<Integer>[] paths = new LinkedList[n];
	
	private static int[] vis = new int[n];
	private static HashMap<Integer, Vertex> hm = new HashMap<>();

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) adj[i] = new LinkedList<>();
		for (int i = 0; i < n; i++) paths[i] = new LinkedList<>();

		for (int i = 0; i <= n; i++) hm.put(i, new Vertex(i)); 

		
		
		addEdge(hm.get(1),hm.get(2));
		addEdge(hm.get(3),hm.get(2));
		addEdge(hm.get(4),hm.get(2));
		addEdge(hm.get(5),hm.get(2));


//		addEdge(hm.get(0),hm.get(1));
//		addEdge(hm.get(1),hm.get(2));
//		addEdge(hm.get(1),hm.get(3));
//		addEdge(hm.get(3),hm.get(2));
//		addEdge(hm.get(1),hm.get(4));
//		addEdge(hm.get(4),hm.get(2));
//		addEdge(hm.get(4),hm.get(5));
//		addEdge(hm.get(5),hm.get(2));
//		addEdge(hm.get(5),hm.get(6));
//		addEdge(hm.get(6),hm.get(4));		
		
//		addEdge(hm.get(1),hm.get(2));
//		addEdge(hm.get(1),hm.get(5));
//		addEdge(hm.get(2),hm.get(3));
//		addEdge(hm.get(2),hm.get(5));
//		addEdge(hm.get(3),hm.get(4));
//		addEdge(hm.get(4),hm.get(5));
//		addEdge(hm.get(5),hm.get(3));

//				addEdge(hm.get(1),hm.get(2));
//				addEdge(hm.get(2),hm.get(4));
//				addEdge(hm.get(1),hm.get(3));
//				addEdge(hm.get(3),hm.get(4));
//				addEdge(hm.get(3),hm.get(2));

//				addEdge(hm.get(1),hm.get(2));
//				addEdge(hm.get(3),hm.get(2));
//				addEdge(hm.get(1),hm.get(3));
//				addEdge(hm.get(1),hm.get(4));
//				addEdge(hm.get(4),hm.get(2));
//				addEdge(hm.get(4),hm.get(3));
//				addEdge(hm.get(2),hm.get(4));

//				addEdge(hm.get(0),hm.get(1));
//				addEdge(hm.get(1),hm.get(2));
//				addEdge(hm.get(1),hm.get(3));
//				addEdge(hm.get(2),hm.get(3));
//				addEdge(hm.get(0),hm.get(2));
//				addEdge(hm.get(0),hm.get(3));

//				addEdge(hm.get(1),hm.get(2));
//				addEdge(hm.get(2),hm.get(3));
//				addEdge(hm.get(1),hm.get(3));
//				addEdge(hm.get(3),hm.get(4));
//				addEdge(hm.get(1),hm.get(4));
		
//				addEdge(hm.get(1),hm.get(2));
//				addEdge(hm.get(2),hm.get(3));
//				addEdge(hm.get(3),hm.get(4));
//				addEdge(hm.get(4),hm.get(2));

		//		addEdge(hm.get(0), hm.get(1));
		//		addEdge(hm.get(0), hm.get(1));
		//		addEdge(hm.get(0), hm.get(1));

//				addEdge(hm.get(1),hm.get(2));
//				addEdge(hm.get(1),hm.get(3));
//				addEdge(hm.get(2),hm.get(3));
//				addEdge(hm.get(2),hm.get(4));
//				addEdge(hm.get(3),hm.get(4));
//				addEdge(hm.get(4),hm.get(1));
				
//				addEdge(hm.get(1),hm.get(2));
//				addEdge(hm.get(2),hm.get(3));
//				addEdge(hm.get(3),hm.get(4));
//				addEdge(hm.get(4),hm.get(1));
//				addEdge(hm.get(4),hm.get(2));
//				addEdge(hm.get(1),hm.get(3));
//				addEdge(hm.get(3),hm.get(1));

		// store how many verticies are connected to one <- for each node ?

		sp(hm.get(s),hm.get(t));
	
//		System.out.println("\n" + hm.get(t).paths);
		
	}

	private static int[] path = new int[n];
	private static int idx = 0;
	
	// for spT
	private static int curSize = 0;
	
	private static int cur = 0;
	
	static int cnt = 0;
	static int prevSize = 0;
	static int c = 0;
	
	
	public static void sp(Vertex u, Vertex v) {		
		
		if (u.n == v.n) {
			
			v.paths++;
			
			for (int i = 0; i < idx; i++) {
				paths[cur].add(path[i]);
			}
			
			System.out.print(paths[cur].size() != 0 ? paths[cur] + "\n": "");		

			if (idx != curSize) {
				curSize = idx;
				cnt++;
			}
			
			System.out.print(curSize == 0 ? "" : curSize + "\n");

			cur++;
			
		} else {
			
			vis[u.n] = true;
			path[idx++] = u.n; 
			
			System.out.println("sdf:" + u.n);
						
			for (Vertex w : adj[u.n]) {				
				System.out.println("cur:" + w.n);
								
				if (vis[w.n] != w.prev.size()) {
					sp(w, v); 
				}
			}

			idx--;
			
		}	
	}

	public static void addEdge(Vertex u, Vertex v) {
		if (!adj[u.n].contains(v)) {
			adj[u.n].add(v);
			v.prev.add(u);	
		}
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter ps = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	static void print(Object o) {
		ps.print(o);
	}

	static void println() {
		ps.println();
	}

	static void println(Object o) {
		ps.println(o);
	}

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}

	static void exit() {
		ps.close();
		System.exit(0);
	}
}
