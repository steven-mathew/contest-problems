package CCC;

import java.util.Scanner;

public class CCC_01_J2 {

	static int modInverse(int m, int n) {
		m = m % n; 
		for(int i = 1; i < n; i++)
			if ((m * i) % n == 1)
				return i;
		return 1;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int res = modInverse(m,n);
		
		if(res == 1) {
			System.out.println("No such integer exists.");
		} else {
			System.out.println(res);

		}
		
	}
}
