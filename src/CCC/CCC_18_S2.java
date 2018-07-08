package CCC;

import java.util.Scanner;

public class CCC_18_S2 {

	public static void main(String[] argy) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		int[][] flower = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] y = sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				flower[i][j] = Integer.parseInt(y[j]);
			}
		}

		for (int i = 0; i < 4; i++) {
			if (!check(flower))
				rotate(flower);
		}

		for (int[] y : flower) {
			for (int x : y) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	public static boolean check(int[][] flower) {

		int n = flower.length;

		if (flower[0][0] < flower[0][n - 1] &&
			flower[n - 1][0] < flower[n - 1][n - 1] && 
			flower[0][n - 1] < flower[n - 1][n - 1] &&
			flower[0][0] < flower[n - 1][0]) {
			return true;
		}
			
		return false;
	}

	public static void rotate(int[][] flower) {

		int n = flower.length;
		int temp;

		for (int y = 0; y < n / 2; y++)
			for (int x = y; x < n - y - 1; x++) {
				temp = flower[y][x];
				
				flower[y][x] = flower[x][n - 1 - y];
				flower[x][n - 1 - y] = flower[n - 1 - y][n - 1 - x];
				flower[n - 1 - y][n - 1 - x] = flower[n - 1 - x][y];
				flower[n - 1 - x][y] = temp;
			}

	}

}
