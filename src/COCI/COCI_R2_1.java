package COCI;

import java.util.Scanner;

public class COCI_R2_1 {
	
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] t = sc.nextLine().split(" ");
		
		int s = Integer.parseInt(t[1]);
		int r1 = Integer.parseInt(t[0]);
		
		System.out.println(2*s - r1);
		
	}

}
