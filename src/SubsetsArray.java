import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SubsetsArray {

	public static void main(String[] args) {

		Map<Integer,String> m = new HashMap<>();
		int min = 0;

		Scanner sc = new Scanner(System.in);

		try {

			while(sc.hasNextLine()) {

				int i = 0;

				String l = sc.nextLine();
				String[] t = l.split(" ");


				m.put(Integer.parseInt(t[1]), t[i]);

				i++;

				List n1 = new ArrayList(m.keySet());
				Collections.sort(n1);

				min = (int) n1.get(0);

				if(l.contains("Waterloo")) {
					System.out.println(m.get(min));
				}

			}


		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
