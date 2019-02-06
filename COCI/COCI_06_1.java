package COCI;

import java.util.HashSet;
import java.util.Scanner;

public class COCI_06_1 {
	public static void main(String... args) {		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> h = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {	
			h.add(Integer.parseInt(sc.nextLine()) % 42);		
		}
		
		System.out.println(h.size());	
	}
}
