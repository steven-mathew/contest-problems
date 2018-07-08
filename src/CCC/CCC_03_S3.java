package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC_03_S3 {
	
	public static int floor = 105;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int floor = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		int rows = Integer.parseInt(sc.nextLine());
		int cols = Integer.parseInt(sc.nextLine());
		
		char[][] plan = new char[rows + 2][cols + 2];	
		ArrayList<Integer> path = new ArrayList<>();
		
		for (int y = 0; y < rows; y++) {
			String s = sc.nextLine();
			for (int x = 0; x < cols; x++) {
				plan[y + 1][x + 1] = s.charAt(x);
			}		
		}
		
/*		
		for (char[] y : plan) {	
			for (char x : y) {
				System.out.print(x);
			}
			System.out.println();
		}	*/
					
		// flood
		
		int roomCnt = 0;
		
			for (int i = 0; i < rows + 1; i++) {
				for (int j = 0; j < cols + 1; j++) {
					if (plan[i][j] == '.') {
						fill(plan, '.', 'I', j, i);
						roomCnt++;
						System.out.println("room " + roomCnt);
						printPlan(plan);
					}
				}
			}
												
	}
	
	public static void fill(char[][] plan, char oldColor, char newColor, int x, int y) {
		
			char currColor = plan[y][x];
			if (currColor == oldColor) {
				plan[y][x] = newColor;
				
				fill(plan, oldColor, newColor, x + 1, y    );
				fill(plan, oldColor, newColor, x - 1, y    );
				fill(plan, oldColor, newColor, x    , y + 1);
				fill(plan, oldColor, newColor, x    , y - 1);		
				
			}
		
	}
	
	public static void printPlan(char[][] plan) {	
		
		for (char[] y : plan) {	
			for (char x : y) {
				System.out.print(x);
			}
			System.out.println();
		}	
		System.out.println();
	}
}
