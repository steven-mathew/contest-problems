package DMOJ;

import java.util.Arrays;
import java.util.Scanner;

public class PotionsHomework {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		long sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += arr[i] * arr[n - i - 1];
		}
			
		System.out.println(sum % 10007);
	}
}