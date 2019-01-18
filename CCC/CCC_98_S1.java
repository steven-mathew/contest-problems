package CCC;

import java.util.Scanner;

public class CCC_98_S1 {	
	public static void main(String... args) {		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			
			String[] word = sc.nextLine().split(" ");		
			
			for(int j = 0; j < word.length; j++) {
				if(word[j].length() == 4) {
					word[j] = "****";
				}
			}
			
			for(String words: word) {
				System.out.print(words + " ");
			}
			
			System.out.println();
		}	
	}
}
