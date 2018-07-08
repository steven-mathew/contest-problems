package CCC;

import java.util.ArrayList;
import java.util.Scanner;


// 3/5 correct? why...

public class CCC_08_S3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {

			int r = Integer.parseInt(sc.nextLine());			
			int c = Integer.parseInt(sc.nextLine());

			char[][] maze = new char[r + 2][c + 2];

			ArrayList<Integer> path = new ArrayList<>();


			for (int j = 0; j < r; j++) {
				String row = sc.nextLine();
				for (int k = 0; k < c; k++) {
					maze[j + 1][k + 1] = row.charAt(k);
				}
			}		

			search(maze, 1, 1, path, c, r);

			//			System.out.println(path);
			//			
			//			for (char[] ch : maze) {
			//				for (char x : ch) {
			//					System.out.print(x);
			//				}
			//				System.out.println();
			//			}

			int output = counter(maze, path);

			if(output == 0) {
				System.out.println(-1);
			} else {
				System.out.println(output);
			}	
			
		}

	}

	public static boolean search(char[][] maze, int x, int y, ArrayList<Integer> path, int c, int r) {

		if (x == c && y == r) {
			path.add(x);
			path.add(y);
			return true;
		}

		int up = -1;
		int down = 1;
		int right = 1;
		int left = -1;
		
		if (maze[y][x] == '-') {
			maze[y][x] = '>';
			if (search(maze, x + right, y, path, c, r) || search(maze, x + left, y, path, c, r)) {
				path.add(x);
				path.add(y);
				return true;
			}
		}

		
		if (maze[y][x] == '|') {
			maze[y][x] = '>';
			if  ((search(maze, x, y + up, path, c, r)) || (search(maze, x, y + down, path, c, r))){
				path.add(x);
				path.add(y);
				return true;
			}
		}
		

		if (maze[y][x] == '+') {
			maze[y][x] = '>';
			if ((search(maze, x, y + up, path, c, r)) || (search(maze, x, y + down, path, c, r)) || (search(maze, x + right, y, path, c, r)) || (search(maze, x + left, y, path, c , r))){
				path.add(x);
				path.add(y);
				return true;
			}
		}

		return false;
	}

	public static int counter(char[][] maze, ArrayList<Integer> path) {		
		int count = 0;

		for(int p = 0; p < path.size(); p += 2) {
			count++;
		}

		return count;
	}

}
