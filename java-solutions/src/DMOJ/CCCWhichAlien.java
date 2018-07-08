package DMOJ;

import java.util.Scanner;

public class CCCWhichAlien {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int ant = sc.nextInt();
		int eye = sc.nextInt();

		if (ant >= 3 && eye <= 4){
			System.out.println("TroyMartian");
		}
		if (ant <= 6 && eye >= 2){
			System.out.println("VladSaturnian");
		}
		if (ant <= 2 && eye <= 3){
			System.out.println("GraemeMercurian");
		}

	}

}
