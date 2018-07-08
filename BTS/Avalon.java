package BTS;

import java.util.Scanner;

public class Avalon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		double mult = 1;
		
		for(int i = 0; i < n; i++) {
			
			String s = sc.nextLine();
			String[] t = s.split(" ");
			double a = Integer.parseInt(t[0]);
			double b = Integer.parseInt(t[1]);
			mult *= a/b;		
		}
		
		if(mult == 0)
			System.out.println(0);
		else
			System.out.println(mult);
	}

}
