package DMOPC;

import java.util.Scanner;

public class DMOPC_14_P1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		String[] station = new String[n];

		for(int i = 0; i < n; i++) {
			station[i] = sc.nextLine();
		}

		if(n < 3){
			System.out.println("N");
		}
		
		for(int i = 1; i < n - 1; i++) {
			if(station[i].equals("Bessarion")) {
				if((station[i - 1].equals("Bayview") && station[i + 1].equals("Leslie")) || (station[i - 1].equals("Leslie") && station[i + 1].equals("Bayview"))) {
					System.out.println("Y");
				} else {
					System.out.println("N");
				}
			}

		}

	}
}
