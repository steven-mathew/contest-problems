package DMOJ;

import java.util.Random;
import java.util.Scanner;

public class UnevenSand {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		for(int i = 0; i < 31; i++) {
			int x = rand.nextInt(100) + 1;
			System.out.println(x);
			String s = sc.nextLine();
			if(s.equals("OK")) {
				System.exit(0);
			} else {	
				System.out.flush();
			}
		}

	}

}
