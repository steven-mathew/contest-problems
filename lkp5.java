package template;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class lkp5 {
	
	public static void main(String[] args) throws IOException {
		int n = readInt();
		int d = readInt();
		
		int[] a = new int[n];
		int[] pre = new int[n+1];
		
		
		for (int i = 0; i < n; i++) {
			a[i] = readInt();
			pre[i+1] = pre[i] + a[i];
		}
				
		int tmp = pre[n];
				
		println(smallestSubWithSum(a, n, tmp / 2.0));
		
		for (int i = 0; i < d; i++) {
			int x = readInt(); int y = readInt();
			
			tmp -= a[x-1];
			a[x-1] = y;
			tmp += y;
			
			println(smallestSubWithSum(a, n, tmp / 2.0));			
		}
					
		exit();			
	}		
		
	static int smallestSubWithSum(int arr[], int n, double x) { 
	    int curr_sum = 0, min_len = n+1; 
	  
	    int start = 0, end = 0; 
	    while (end < n) 
	    { 
	        while (curr_sum <= x && end < n) 
	            curr_sum += arr[end++]; 
	  
	        while (curr_sum > x && start < n) 
	        { 
	            if (end - start < min_len) 
	                min_len = end - start; 
	  
	            curr_sum -= arr[start++]; 
	        } 
	    } 
	    return min_len; 
	}
	
	private static final int BUFFER_SIZE = 1 << 16;
	private static DataInputStream din = new DataInputStream(System.in);
	private static byte[] buffer = new byte[BUFFER_SIZE];
	private static int bufferPointer = 0, bytesRead = 0;
	private static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static String readLine() throws IOException {
        byte[] buf = new byte[6400]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public static List<Integer> readLineAsIntegers() throws IOException {
        List<Integer> ret = new ArrayList<>();
        byte c = read();
        while (c != -1) {
            if (c == '\n' || c == '\r')
                break;

            int i = 0;
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }

            do {
                i = i * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');
            ret.add((negative) ? -i : i);
        }
        return ret;
    }

    public static List<Long> readLineAsLongs() throws IOException {
        List<Long> ret = new ArrayList<>();
        byte c = read();
        while (c != -1) {
            if (c == '\n' || c == '\r')
                break;

            // next integer
            long i = 0;
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }

            do {
                i = i * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');
            ret.add((negative) ? -i : i);
        }
        return ret;
    }

    public static List<Double> readLineAsDoubles() throws IOException {
        List<Double> ret = new ArrayList<>();
        byte c = read();
        while (c != -1) {
            if (c == '\n' || c == '\r')
                break;

            // next integer
            double d = 0, div = 1;
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }

            do {
                d = d * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    d += (c - '0') / (div *= 10);
                }
            }
            ret.add((negative) ? -d : d);
        }
        return ret;
    }

    public static int readInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        return (neg) ? -ret : ret;
    }

    public static long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg) {
            c = read();
        }

        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        return (neg) ? -ret : ret;
    }

    public static double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = read();
        }
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');

        if (c == '.') {
            while ((c = read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }

        return (neg) ? -ret : ret;
    }

    public static String nextString() throws IOException {
        byte[] ret = new byte[1024];
        int idx = 0;
        byte c = read();
        while (c <= ' ') {
            c = read();
        }
        do {
            ret[idx++] = c;
            c = read();
        } while (c != -1 && c != ' ' && c != '\n' && c != '\r');
        return new String(ret, 0, idx);

    }

    private static byte read() throws IOException {
        if (bufferPointer == bytesRead) {
            // fill buffer
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }
        return buffer[bufferPointer++];
    }

    public static int[] readLineAsIntArray(int n) throws IOException {
        int[] ret = new int[n];
        int idx = 0;
        byte c = read();
        while (c != -1) {
            if (c == '\n' || c == '\r')
                break;

            int i = 0;
            while (c <= ' ') {
                c = read();
            }
            boolean negative = (c == '-');
            if (negative) {
                c = read();
            }

            do {
                i = i * 10 + (c - '0');
                c = read();
            } while (c >= '0' && c <= '9');

            ret[idx++] = (negative) ? -i : i;
            if (idx >= n) {
                break;
            }

        }
        return ret;
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
