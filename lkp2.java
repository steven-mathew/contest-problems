package template;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class lkp2 {
	
	private static int n;
	
	public static void main(String[] args) throws IOException { 
		n = readInt();
		String s = readLine().trim();

		int count = 0;
		
		for (int len = 1; len <= n; len++) {     
	        for (int i = 0; i <= n - len; i++) {             
	            int j = i + len - 1;
	            String cur = s.substring(i, j + 1);
	              
	            

	        } 
	    } 
		
		System.out.println(count + 1);	    		
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