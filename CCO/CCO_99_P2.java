package CCO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class CCO_99_P2 {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {

			String[] t = sc.nextLine().split(" ");

			int x = Integer.parseInt(t[0]);
			int k = Integer.parseInt(t[1]);
			HashMap<String, Integer> h = new HashMap<>();
			ArrayList<Integer> list = new ArrayList<>();


			for(int j = 0; j < x; j++) {

				String s = sc.nextLine();				

				if(h.containsKey(s)) {
					h.put(s, h.get(s)+1);
				} else {
					h.put(s, 1);
				}

			}

			list.addAll(h.values());

			Collections.sort(list);
			int ind = list.size() - k;
			
			System.out.print("\n"+ordinal(k) + " most common word(s):\n");
			
			for(Entry<String, Integer> t1 : h.entrySet()) {
				if(list.size() >= k - 1) {
					if(t1.getValue() == list.get(ind)) {	
						System.out.println(t1.getKey());		
					}
				}
			}

			h.clear();
			list.clear();

		}
	}

	public static String ordinal(int i) {
		String[] suffixes = new String[] {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
		switch (i % 100) {
		case 11:
		case 12:
		case 13:
			return i + "th";
		default:
			return i + suffixes[i % 10];
		}
	}
}