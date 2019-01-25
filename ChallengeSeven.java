package CS341;

import java.util.HashMap;

public class ChallengeSeven {

	private static HashMap<Character,String> h = new HashMap<>();
	private static String t = "";
	private static int lim = 5;
	
	public static void main(String[] args) {
		h.put('0', "01");
		h.put('1', "42");
		h.put('2', "2");
		h.put('4', "01");

		f("0");
//		System.out.println(t);
			
	}
	
	public static String f(String s) {
				
		if (lim == 0) return t;
		lim--;

		t = "";
		
		int sum = 0;
		
		for (char c : s.toCharArray()) {
			t += h.get(c);
			sum += Character.getNumericValue(c);
		}
		
		System.out.printf("\n%-40s%d", t, sum);
		
		return f(t);
	}

}
