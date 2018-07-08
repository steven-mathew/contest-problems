package DMOJ;

import java.util.Scanner;

public class Piggy {

	public static int nextPrime(int n) {
	    boolean isPrime = false;

	    int s = 2; 

	    while (!isPrime) {
	        n++;
	        int m = (int) Math.ceil(Math.sqrt(n));

	        isPrime = true;
	        
	        for (int i = s; i <= m; i++) {
	            if (n % i == 0) {
	                isPrime = false;
	                break;
	            } 
	        }
	    }
	    return n;
	}
	
	public static boolean isPrime(long n) {
		
		if(n != 1) {
	    if(n > 2 && (n & 1) == 0)
	       return false;
	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) 
	            return false;
		}
	    return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		if(!isPrime(n))
			System.out.println(nextPrime(n));
		else if (n != 1)
			System.out.println(n);
		else if (n == 1) 
			System.out.println(2);
	
	}

}
