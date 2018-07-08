package DMOJ;

import java.util.Scanner;

public class Ship {

	public static void main(String[] args) {

		String str = null;
		Scanner sc = new Scanner(System.in);

		try {

			str = sc.nextLine();

			if(str.matches("[BFTLC]+")) {
				
				if(!str.contains("B")) {
					System.out.println("B");
				}
				if(!str.contains("F")) {
					System.out.println("F");
				}
				if(!str.contains("T")) {
					System.out.println("T");
				}
				if(!str.contains("L")) {
					System.out.println("L");
				}
				if(!str.contains("C")) {
					System.out.println("C");
				}
				
				else if ((str.contains("B")) && (str.contains("F")) && (str.contains("T")) && (str.contains("L")) && (str.contains("C"))){
					System.out.print("NO MISSING PARTS");
				}
				
			} else {
				System.out.println("B");
				System.out.println("F");
				System.out.println("T");
				System.out.println("L");
				System.out.println("C");
			}
			
		

		} catch(Exception e) {
			System.out.print("NO MISSING PARTS");
		}


	}

}
