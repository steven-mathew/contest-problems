package DMOJ;

import java.util.Scanner;

public class CCC_07_sS1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {
			int y = 0;
			int d = 0;
			int m = 0;
			String s = sc.nextLine();
			String[] t = s.split(" ");
			y = Integer.parseInt(t[0]);
			m = Integer.parseInt(t[1]);
			d = Integer.parseInt(t[2]);
						
			if(2007 - y > 18) {
				System.out.println("Yes");
			} else if (2007 - y < 18) {
				System.out.println("No");
			} else if (2007 - y == 18) {
				if(m == 2) {
					if(d <= 27) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else if (m < 2) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
					
			}	
		}	
	}
}

