package DMOJ;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Hailstone {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("num.txt");
		Scanner sc = new Scanner(file);
		
		String s = sc.nextLine();
		
		BigInteger n = new BigInteger(s); 
		int c = 0;
		
		while(n.compareTo(BigInteger.ONE) > 0) {
			
			if(n.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
				n = n.divide(new BigInteger("2"));
			} else {
				n = n.multiply(new BigInteger("3"));
				n = n.add(new BigInteger("1"));
			}
			
			System.out.println(n);
			
			c++;
		}
		
		System.out.println("c: " + c);

	}

}
