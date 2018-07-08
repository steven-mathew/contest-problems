package DMOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DMOPCItami {

	public static void main(String[] args) {

		Map<String,Double> m = new HashMap<>();
		int min = 0;

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		try {
			
			
			while(sc.hasNextLine()) {
				String l = sc.nextLine();
				String[] t = l.split(" ");


				int k = 1;
				m.put(t[0], Double.parseDouble(t[k]));

				List n1 = new ArrayList(m.keySet());
				Collections.sort(n1);

				System.out.println(n1.get(k-1));
				
				k++;
				
			}


		} catch(Exception e) {
			e.printStackTrace();
		}


	}

}
