package CCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CCC_18_S3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split(" ");
		int rows = Integer.parseInt(s[0]);
		int cols = Integer.parseInt(s[1]);

		//		System.out.println(rows + " " + cols);

		char[][] maze = new char[rows][cols];

		ArrayList<Integer> path = new ArrayList<>();

		for (int y = 0; y < rows; y++) {
			String s1 = sc.nextLine();
			for (int x = 0; x < cols; x++) {
				maze[y][x] = s1.charAt(x);
			}
		}

		char[][] tempMaze = new char[rows][cols];

		for (int y = 0; y < rows; y++) {
			for (int x = 0; x < cols; x++) {
				tempMaze[y][x] = maze[y][x];
			}
		}

		int startX = 0;
		int startY = 0;

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == 'S') {
					startX = j;
					startY = i;
				}
			}
		}

//		System.out.println(startX + " " + startY);

		for (int i = 1; i < maze.length; i++) {
			for (int j = 1; j < maze[0].length; j++) {
				if (maze[i][j] == '.') { 
					//					System.out.println(j + " " + i);
					search(maze, startX, startY, path, j, i);
					System.out.println(counter(path));

//					System.out.println(path);
//
//					for (char[] ch : maze) {
//						for (char x : ch) {
//							System.out.print(x);
//						}
//						System.out.println();
//					}		

					// reset
					maze = cloneArray(maze, tempMaze);		
					path.clear();   	
				}
			}
		}

		//		search(maze, 4, 3, path, startX, startY);

	}


	public static int counter(ArrayList<Integer> path) {		
		int count = 0;

		for(int p = 0; p < path.size(); p += 2) {
			count++;
		}

		return count - 1;
	}

	public static boolean search(char[][] maze, int x, int y, ArrayList<Integer> path, int startX, int startY) {

		if (x == startX && y == startY && maze[y][x] != 'Z') {
			path.add(x);
			path.add(y);
			return true;
		}

		int up = -1;
		int down = 1;
		int left = -1;
		int right = 1;

		int camX = 0;
		int camY = 0;

		for (int i = 1; i < maze.length; i++) {
			for (int j = 1; j < maze[0].length; j++) {
				if (maze[i][j] == 'C') {				
					camX = j;
					camY = i;				
				}
			}
		}

//		System.out.println(camX + " " + camY);


		if (camY != 0 && camX != 0) {

			// cam check right	
			for (int i = 1; i < maze[0].length - camX - 1; i++) {
				if (maze[camY][camX + i] == '.' ) {
					if (maze[camY][camX + i - 1] == 'U') {
						maze[camY][camX + i] = 'Z';
					} 
				} 
			}

			// cam check left	
			for (int i = 1; i < maze[0].length - camX - 1; i++) {
				if (maze[camY][camX - i] == '.' ) {
					if (maze[camY][camX - i + 1] == 'U') {
						maze[camY][camX - i] = 'Z';
					}
				} 
			}

			// cam check up
			for (int i = 1; i < maze[0].length - camX - 1; i++) {
				if (maze[camY - i][camX] == '.' ) {
					if (maze[camY - i + 1][camX] == 'U') {
						maze[camY - i][camX] = 'Z';
					}
				} 
			}

			// cam check down	
			for (int i = 1; i < maze[0].length - camX - 1; i++) {
				if (maze[camY + i][camX] == '.' ) {
					if (maze[camY + i - 1][camX] == 'U') {
						maze[camY + i][camX] = 'Z';
					} 
				} 
			}

			if (maze[camY - 1][camX] == '.'){
				maze[camY - 1][camX] = 'Z';
			} 

			if (maze[camY + 1][camX] == '.'){
				maze[camY + 1][camX] = 'Z';
			} 

			if (maze[camY][camX - 1] == '.'){
				maze[camY][camX - 1] = 'Z';
			} 

			if (maze[camY][camX + 1] == '.'){
				maze[camY][camX + 1] = 'Z';
			} 
		}
				
		if (maze[y][x] == 'S') {
			maze[y][x] = 'X';
			if ((search(maze, x, y + up, path, startX, startY)) || (search(maze, x, y + down, path, startX, startY)) || (search(maze, x + right, y, path, startX,startY)) || (search(maze, x + left, y, path, startX , startY))){
				path.add(x);
				path.add(y);
				return true;
			}
		}

		if (maze[y][x] == '.') {
			maze[y][x] = 'X';
			if ((search(maze, x, y + up, path, startX, startY)) || (search(maze, x, y + down, path, startX, startY)) || (search(maze, x + right, y, path, startX, startY)) || (search(maze, x + left, y, path, startX , startY))){
				path.add(x);
				path.add(y);
				return true;
			}
		}

		if (maze[y][x] == 'L') {
			maze[y][x] = 'X';
			if (search(maze, x + left, y, path, startX, startY)){
				return true;
			}
		}

		if (maze[y][x] == 'R') {
			maze[y][x] = 'X';
			if (search(maze, x + right, y, path, startX , startY)){
				return true;
			}
		}


		if (maze[y][x] == 'U') {
			maze[y][x] = 'X';
			if (search(maze, x, y + up, path, startX , startY)){
				return true;
			}
		}

		if (maze[y][x] == 'D') {
			maze[y][x] = 'X';
			if (search(maze, x, y + down, path, startX , startY)){
				return true;
			}
		}

		return false;

	}

	public static char[][] cloneArray(char[][] old, char[][] curr){

		for (int i = 0; i < old.length; i++)
			for (int j = 0; j < old[i].length; j++)
				old[i][j] = curr[i][j];

		return old;
	}

}
