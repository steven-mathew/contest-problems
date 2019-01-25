package CS341;

import java.io.IOException;
import java.util.Scanner;

public class ChallengeOne {

	static char[] primeDict = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		String s = sc.nextLine().replaceAll(" ", "");
		
		int len = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i+=2) {
			for (int j = 2 + i; j <= s.length(); j+=2) {				
				String cur = s.substring(i,j);
				
				if (abelian(cur)) {
					len = Math.max(len, cur.length());
				}
			}
		}

		System.out.println(len);
	}
	
	public static boolean abelian(String tmp) {	
		char[] s = tmp.toCharArray();
		
		int sprod = 1; for (int i = 0; i < s.length/2; i++) sprod *= primeDict[(s[i] - 'A') % 26];		
		int tprod = 1; for (int i = s.length/2; i < s.length; i++) tprod *= primeDict[(s[i] - 'A') % 26];
		
		return sprod == tprod;
	}


}
