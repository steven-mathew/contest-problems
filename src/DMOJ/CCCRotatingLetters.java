package DMOJ;

import java.util.Scanner;

public class CCCRotatingLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean fail = false;
		
		for(char ch : s.toCharArray()) {
			
			if((ch == 'I') || (ch == 'O') || (ch == 'S') || (ch == 'H')) {
				fail = false;
			} else if ((ch == 'Z') || (ch == 'X') || (ch == 'N')) {
				fail = false;
			} else {
				System.out.println("NO");
				fail = true;
				break;
			}
			
		}
		
		if (fail == false)
			System.out.println("YES");

	}

}
