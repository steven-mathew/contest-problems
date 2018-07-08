package DMOJ;

import java.util.Scanner;

public class ShiftingChars {

	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String table = alpha + alpha + alpha.toUpperCase() + alpha.toUpperCase();
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();

		for(char ch : s.toCharArray()){

			int index = table.indexOf(ch);
			if(index != -1)
				ch = table.charAt(index + n);
			
			System.out.print(ch);
		}

		


	}

}
