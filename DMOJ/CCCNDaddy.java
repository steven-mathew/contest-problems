package DMOJ;

import java.util.Scanner;

public class CCCNDaddy {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			int n1= Integer.parseInt(sc.nextLine());
			int n = 0;

			for(int i = 0; i <= 5; i++){
				for(int j = 0; j <= i; j++){
					if(i+j==n1) n++;
				}
			}
			
			System.out.println(n);

		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
