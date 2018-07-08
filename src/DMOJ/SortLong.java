package DMOJ;

import java.util.Arrays;
import java.util.Scanner;

public class SortLong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());


		for(int i = 0; i < n; i++) {
			
			String[] t = sc.nextLine().split(" ");
			long[] arr = new long[t.length];
			
			for(int j = 0; j < t.length; j++) {
				arr[j] = Long.parseLong(t[j]);
			}	

			Arrays.sort(arr);

			for(long x : arr) {
				System.out.print(x + "\n");
			}		
			
		}
		
	}

}
