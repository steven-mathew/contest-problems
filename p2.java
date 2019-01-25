package newyears;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2 {

	public static void main(String[] args) throws IOException {

		int n = readInt(); int m = readInt();
			
		int[][] a = new int[n+1][2];
		
		for (int i = 1; i <= n; i++) {
			int x = readInt(); int y = readInt();		
			a[i][0] = x; a[i][1] = y;
		}
		
		int[] p = new int[n+1];
				
		for (int qq = 0; qq < m % n; qq++) { 			
			for (int i = 0; i < n; i++) {
				if (p[i] == 0) {	
					p[i] = 1;
					i = a[i][0];
									
					if (i == n + 1) break;					
				} else {	
					p[i] = 0;
					i = a[i][1];
					
					if (i == n + 1) break;
				}		
			}		
		}
	
		for (int i = 0; i < n; i++) 
			print(p[i]);
			
		
		
		exit();
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
