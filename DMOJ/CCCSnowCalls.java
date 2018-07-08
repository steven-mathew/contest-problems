package DMOJ;

import java.util.HashMap;
import java.util.Scanner;

public class CCCSnowCalls {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> h = new HashMap<>();
		
		h.put('A', 2);
		h.put('B', 2);
		h.put('C', 2);
		
		h.put('D', 3);
		h.put('E', 3);
		h.put('F', 3);
		
		h.put('G', 4);
		h.put('H', 4);
		h.put('I', 4);
		
		h.put('J', 5);
		h.put('K', 5);
		h.put('L', 5);
		
		h.put('M', 6);
		h.put('N', 6);
		h.put('O', 6);
		
		h.put('P', 7);
		h.put('Q', 7);
		h.put('R', 7);
		h.put('S', 7);
		
		h.put('T', 8);
		h.put('U', 8);
		h.put('V', 8);
		
		h.put('W', 9);
		h.put('X', 9);
		h.put('Y', 9);
		h.put('Z', 9);
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		n = Integer.parseInt(sc.nextLine());
		int i = 0;
		
		while(i < n) {
			
			String str = sc.nextLine();
			String converted = "";
			
			for(char ch : str.toCharArray()) {
				if (ch != '-') {
					if(Character.isLetter(ch)) {
						converted += h.get(ch);
					} else {
						converted += ch;
					}
				}
			}
			
			System.out.println(converted.substring(0, 3) + "-" + converted.substring(3,6) + "-" + converted.substring(6,10));
			
		i++;
		
		}
		
		
		
		
		
		
	}
	
}
