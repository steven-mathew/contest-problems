package CCC;

import java.util.HashSet;
import java.util.Scanner;

public class CCC_13_J3 {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		n++;
				
		while(!distinct(n)) {
			n++;
		}
		
		System.out.println(n);
		

	}
	
	public static boolean distinct(int n) {
		
		HashSet<Character> h = new HashSet<>();
		
		String s = Integer.toString(n);
		
		for(char digit : s.toCharArray()) {
			if(h.contains(digit)) {
				return false;
			} else {
				h.add(digit);
			}
		}
		
		return true;
	}
}
