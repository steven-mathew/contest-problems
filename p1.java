package newyears;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p1 {

	public static void main(String[] args) throws IOException {

		int h1 = readInt(); int w1 = readInt();
		int h2 = readInt(); int w2 = readInt();
		
		int a = w1*(h2 - 1);
		int b = w2*(h1 - 1);
		
		if (a == b) println(-1);
		else if (a < b) println(1);
		else println(2);
		
		
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
