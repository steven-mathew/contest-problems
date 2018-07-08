package DMOJ;

import java.util.Scanner;

public class Goon {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] t = s.split("-");
		
		int[] sum = new int[3];
		
		for(int i = 0; i < 3; i++) {
			
			sum[i] = digitSum(Integer.parseInt(t[i]));
			
		}
		
		if((sum[0] == sum[1]) && (sum[1] == sum[2])) {
			System.out.println("Goony!");
		} else {
			System.out.println("Pick up the phone!");
		}
		
	}
	
	public static int digitSum(int n) {
		
		int sum = 0;
		
		while(n != 0) {
			
			sum += n % 10;
			n = n/10;
			
		}
		
		return sum;		
	}

}
