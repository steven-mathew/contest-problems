package CCC;

import java.util.Scanner;

public class PassTheBall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 1;

		for(int i = 1; i < 4; i++) {
			result *= (n-i);
		}
		
		result /= 6;
		
		System.out.println(result);
		
	}

}
