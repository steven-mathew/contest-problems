package DMOJ;

import java.io.BufferedReader;
import java.util.Scanner;

public class MultiplyBigNum {

	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			int M = sc.nextInt();
			int N = sc.nextInt();
			int [] [] arr = new int[M+1][N+1];
			int K = sc.nextInt();
			for(int q = 0; q < K; q++){
				int y =  sc.nextInt() - 1;
				int x = M - sc.nextInt();	
				int radius = sc.nextInt();
				int bitRate = sc.nextInt();
				
				int startCircle = Math.max(0, x - radius);
				int endCircle = Math.min(M - 1, x+radius);
				
				for(int circleCord = startCircle; circleCord <= endCircle; circleCord++){
					int leg = Math.abs(circleCord - x);
					
					int dist = (int)(Math.sqrt(Math.pow(radius, 2) - Math.pow(leg, 2)));
					
					arr[circleCord][Math.max(0, y - dist)] += bitRate;
					arr[circleCord][Math.min(N, y + dist + 1)] -= bitRate;
				}
			}


			int max = 0;
			int maxFequency = 0;
			for(int x = 0; x < M + 1; x++){
				int currentVal = 0;
				for(int y = 0; y < N + 1; y++){
					currentVal += arr[x][y];
					if (currentVal > max){
						maxFequency = 1;	
						max = currentVal;
					}
					else{
						if (currentVal == max){
							maxFequency++;	
						}	
					}
				}	
			}
			
			System.out.println(max);
			System.out.println(maxFequency);
			
		}
		catch(Exception e){
			System.out.println("IO: General");
		}
	}
}
