package application;
	
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	class Edge {
		int target;
		int weight;
		
		Edge(int target, int weight) {
			this.target = target;
			this.weight = weight;
		}	
	}
		
	private int maxn = 1001;
	private int inf = 1 << 30;
	private int[] dis = new int[maxn];
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			root.setPadding(new Insets(25));
			Scene scene = new Scene(root,400,400);
			
			int n = readInt();
			double[][] point = new double[n][2];
			Color[] color = new Color[n];
			char[] vertexName = new char[n];
			for (int i = 0; i < n; i++) vertexName[i] = (char) ('A' + i);
			

			Canvas canvas = new Canvas(400, 400);
			GraphicsContext gc = canvas.getGraphicsContext2D();
			
			@SuppressWarnings("unchecked")
			List<Edge>[] adj = new ArrayList[n];
			for (int i = 0; i < n; i++) {
				adj[i] = new ArrayList<>();
				
				double rx = 50 + Math.random() * 300;
				double ry = 50 + Math.random() * 300;
				
				point[i][0] = rx+10;
				point[i][1] = ry+10;
							
				gc.setFill((i == 0 || i == n - 1) ? (i == n - 1 ? Color.RED : Color.GREEN) : Color.BLUE);
				gc.fillOval(rx, ry, 15, 15);			
				gc.setFill(Color.BLACK);
				gc.fillText(vertexName[i] + "", rx-5, ry-5, 30);			
			}
			
			for (int i = 0; i < n; i++) {
				int a = readInt(), b = readInt(), w = readInt();			
				
				adj[a-1].add(new Edge(b-1, w));
				adj[b-1].add(new Edge(a-1, w));
			}
			
			List<Character> path = new ArrayList<>();
			
			Queue<Integer> q = new LinkedList<>();
			Arrays.fill(dis, inf);
			dis[0] = 0;
			q.add(0);
				
			int i = 0;
			
			// add starting point to path
			path.add(vertexName[0]);
			
			while(!q.isEmpty()) {
				int cur = q.poll();
							
				// if only one adj vertex, it is a dead end (base case: starting and ending point)
				if (adj[cur].size() == 1 && cur != 0 && cur != n - 1) { 
					gc.fillText("DEADEND: return to " + vertexName[adj[cur].get(0).target], point[cur][0] - 10, point[cur][1] - 10);
					gc.setFill(Color.YELLOW);
					gc.fillOval(point[cur][0] - 10, point[cur][1] - 10, 15, 15);	
				}
					


				for (Edge e : adj[cur]) {
					int next = e.target;
					int w = e.weight;			

					if (dis[next] > dis[cur] + w) {
						dis[next] = dis[cur] + w;
							
						if (next == n - 1) {
							gc.setFill(Color.BLACK);
							path.add(vertexName[n - 1]);
							gc.fillText("GOAL", point[next][0] + 5, point[next][1] + 5);	
						}
												
						gc.setStroke(color[i]);
						gc.setLineWidth(4);
						gc.strokeLine(point[cur][0], point[cur][1], point[next][0], point[next][1]);						
						q.add(next);
						
						i++;
						if (adj[next].size() != 1)
							path.add(vertexName[next]);									
					}									
				}				
			}
			
			for (int j = 0; j < path.size(); j++) {
				print((j != path.size()-1) ? (path.get(j) + "->") : (path.get(j)));
			}
			
			root.getChildren().add(canvas);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	final private static int BUFFER_SIZE = 1 << 16;
	private static DataInputStream din = new DataInputStream(System.in);
	private static byte[] buffer = new byte[BUFFER_SIZE];
	private static int bufferPointer = 0, bytesRead = 0;
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	public static String readLine() throws IOException {
		byte[] buf = new byte[1024]; // line length
		int cnt = 0, c;
		while ((c = Read()) != -1) {
			if (c == '\n')
				break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	public static String read() throws IOException {
		byte[] ret = new byte[1024];
		int idx = 0;
		byte c = Read();
		while (c <= ' ') {
			c = Read();
		}
		do {
			ret[idx++] = c;
			c = Read();
		} while (c != -1 && c != ' ' && c != '\n' && c != '\r');
		return new String(ret, 0, idx);
	}

	public static int readInt() throws IOException {
		int ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}

	public static long readLong() throws IOException {
		long ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');
		if (neg)
			return -ret;
		return ret;
	}

	public static double readDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();

		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (c == '.') {
			while ((c = Read()) >= '0' && c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		if (neg)
			return -ret;
		return ret;
	}

	private static void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private static byte Read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		din.close();
		pr.close();
		System.exit(0);
	}
}
