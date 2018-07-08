package DMOJ;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(long[] arr) {
		
		int len = arr.length;
		
		for(int i = 0; i < len; i++) {
			for(int j = 1; j < len - i; j++) {
				
				if(arr[j - 1] > arr[j]) {
					
					arr[j - 1] ^= arr[j];
					arr[j] ^= arr[j - 1];
					arr[j - 1] ^= arr[j];		
					
//					for(long x : arr) {
//						System.out.print(x + " ");
//					}
					
//					System.out.print("\n");
				}
			}
		}
		
		
	}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		String[] s = sc.nextLine().split(" ");
		
		long[] arr = new long[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(s[i]);
//			System.out.print(arr[i] + " ");
		}	
			
		bubbleSort(arr);	
		
		for(long x : arr) {
			System.out.print(x + " ");
		}
		
	}

}
