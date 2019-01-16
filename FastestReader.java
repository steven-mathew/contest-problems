package template;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastestReader {

	static class Pair implements Comparable<Pair> {
		int a;
		int b;
		Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		@Override
		public int compareTo(Pair arg0) {
			int c = new Integer(a).compareTo(arg0.a);
			if (c != 0) return c;
			
			return new Integer(b).compareTo(arg0.b);
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {

		int n = readInt();
		Pair[] p = new Pair[n];
		
		for (int i = 0; i < n; i++) {
			p[i] = new Pair(readInt(), readInt());
		}		
		
		Arrays.sort(p);
		
		println(chain(p,n));
		
		exit();
	}
	
	public static int chain(Pair[] p, int n) {
		
		int cnt = 1;
		for (int i = 0; i < n-1; i++) {
			if ((p[i].b >= p[i+1].a && p[i].b < p[i+1].b) ||
				(p[i].b < p[i+1].a)) {			
				cnt++;
			}
		}
		
		return cnt;		
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

	static final double EPS = 10e-6;

	public static int lower_bound(int[] arr, int x) {
		int low = 0, high = arr.length, mid = -1;

		while (low < high) {
			mid = (low + high) / 2;

			if (arr[mid] >= x)
				high = mid;
			else
				low = mid + 1;
		}

		return low;
	}

	public static int upper_bound(int[] arr, int x) {
		int low = 0, high = arr.length, mid = -1;

		while (low < high) {
			mid = (low + high) / 2;

			if (arr[mid] > x)
				high = mid;
			else
				low = mid + 1;
		}

		return low;
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int fast_pow_mod(int b, int x, int mod) {
		if (x == 0)
			return 1;
		if (x == 1)
			return b;
		if (x % 2 == 0)
			return fast_pow_mod(b * b % mod, x / 2, mod) % mod;

		return b * fast_pow_mod(b * b % mod, x / 2, mod) % mod;
	}

	public static int fast_pow(int b, int x) {
		if (x == 0)
			return 1;
		if (x == 1)
			return b;
		if (x % 2 == 0)
			return fast_pow(b * b, x / 2);

		return b * fast_pow(b * b, x / 2);
	}

	public static long choose(long n, long k) {
		k = Math.min(k, n - k);
		long val = 1;

		for (int i = 0; i < k; ++i)
			val = val * (n - i) / (i + 1);

		return val;
	}

	public static long permute(int n, int k) {
		if (n < k)
			return 0;
		long val = 1;

		for (int i = 0; i < k; ++i)
			val = (val * (n - i));

		return val;
	}

}
