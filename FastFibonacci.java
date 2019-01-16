package template;

import java.math.BigInteger;
import java.util.Scanner;


public final class FastFibonacci {
	
	// Tests the speed of the 3 Fibonacci algorithms
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = Integer.parseInt(sc.next());
		if (n < 0)
			throw new IllegalArgumentException("Number must be non-negative");
		
		// Do speed benchmark
		long startTime;
		
		startTime = System.nanoTime();
		BigInteger x = fastFibonacciDoubling(n);
		System.out.print(x);

	}
	
	
	/* 
	 * Fast doubling method. Faster than the matrix method.
	 * F(2n) = F(n) * (2*F(n+1) - F(n)).
	 * F(2n+1) = F(n+1)^2 + F(n)^2.
	 * This implementation is the non-recursive version. See the web page and
	 * the other programming language implementations for the recursive version.
	 */
	private static BigInteger fastFibonacciDoubling(int n) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		int m = 0;
		for (int bit = Integer.highestOneBit(n); bit != 0; bit >>>= 1) {
			// Loop invariant: a = F(m), b = F(m+1)
			assert a.equals(slowFibonacci(m));
			assert b.equals(slowFibonacci(m+1));
			
			// Double it
			BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
			BigInteger e = multiply(a, a).add(multiply(b, b));
			a = d;
			b = e;
			m *= 2;
			assert a.equals(slowFibonacci(m));
			assert b.equals(slowFibonacci(m+1));
			
			// Advance by one conditionally
			if ((n & bit) != 0) {
				BigInteger c = a.add(b);
				a = b;
				b = c;
				m++;
				assert a.equals(slowFibonacci(m));
				assert b.equals(slowFibonacci(m+1));
			}
		}
		return a;
	}
	
	/* 
	 * Simple slow method, using dynamic programming.
	 * F(n+2) = F(n+1) + F(n).
	 */
	private static BigInteger slowFibonacci(int n) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			BigInteger c = a.add(b);
			a = b;
			b = c;
		}
		return a;
	}
	
	
	// Multiplies two BigIntegers. This function makes it easy to swap in a faster algorithm like Karatsuba multiplication.
	private static BigInteger multiply(BigInteger x, BigInteger y) {
		return x.multiply(y);
	}
}