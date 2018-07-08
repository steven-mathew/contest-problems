package CCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CCC_18_S1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] villages = new int[n];
		
		for (int i = 0; i < n; i++) {
			villages[i] = sc.nextInt();				
		}
		
		Arrays.sort(villages);
			
		double curMid = Integer.MAX_VALUE;
		
		for (int i = 1; i < n - 1; i++) {
			double mid;
			
			mid = (villages[i + 1] - villages[i])/2.0 + (villages[i] - villages[i-1])/2.0;
	
			if (curMid > mid) {
				curMid = mid;
			}		
		}
			
		System.out.println(String.format("%.1f", curMid));
	}
}
