package DMOJ;

import java.util.Scanner;

public class DWTIITE_R1_1 {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		System.out.println(n);
		
		if(n <= 0) {
			System.out.println("not");
			System.exit(0);
		}
		
		if(n == 1 || n == -1) {
			System.out.println("not");
		} else {
			if(isPrime(n)) {
				System.out.println("prime");
			} else {
				System.out.println("not");
			}
		}

	}

	public static boolean isPrime(long x) {
		
		long n = Math.abs(x);

		if(n != 1) {
			if(n > 2 && (n & 1) == 0)
				return false;
			for(int i = 3; i * i <= n; i += 2)
				if (n % i == 0) 
					return false;
		}
		return true;
	}

}
