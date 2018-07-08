package CCC;

import java.util.Scanner;

public class CCC_14_J1 {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		if ((a1 + a2 + a3) != 180) {
			System.out.println("Error");
		}
		else if (a1 == 60 && a2 == 60){
			System.out.println("Equilateral");
		}
		else if (a1 == a2 || a2 == a3 || a1 == a3) {
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scalene");
		}


	}   

}


