package CCC;

import java.util.Arrays;
import java.util.Scanner;

public class Mock_CCC_18_S1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine()); 
//			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		
		for(int i = 0; i < n - 1; i++) {
			sum += arr[i];
		}
		
		if(sum < arr[n - 1]) {
			System.out.println(sum);
		} else {
			System.out.println((sum + arr[n - 1]) / 2);
		}
		
	}

}
