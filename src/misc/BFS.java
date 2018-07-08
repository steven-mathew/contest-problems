package misc;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	class Cell {
		int x;
		int y;
		Cell (int m, int n) {
			this.x = m;
			this.y = n;
		}
	}
	
	public static void main(String[] args) {
		
		int[][] move = {
				
				{1,0},
				{-1,0},
				{0,1},
				{0,-1}
		};
		
		Queue<Cell> q = new LinkedList<>();
		
		/* traverse grid, if 0... 
		 * add to q new Cell(i,j) 
		 */
		
		/*while queue size is not 0...
		 * temp Cell = q.poll
		 * int x = temp.x
		 * int y = temp.y
		 * 
		 * traverse moves
		 * 		addToQueue( x + move[i][0], y + move[i][1], grid, q, steps)
		 */
		
	}
	
	private void addToQueue(int x, int y, int[][] grid, Queue<Cell> q, int steps) {
		
		/*
		 * if on useless cell, return... 
		 * 
		 * grid[y][x] = steps
		 * q.add new Cell(x,y)
		 */
		
		
	}

}
