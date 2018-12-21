import java.util.HashSet;
import java.util.Scanner;

public class HashtableCheck {
	public static char firstRepeat(String str) {
		HashSet<Character> h = new HashSet<>();

		for(char ch : str.toCharArray()) {
			if (h.contains(ch)) {
				return ch;
			} else {
				h.add(ch);
			}			
		}
		
		return 0;
	}	

	public static void main(String[] args) {
		String str = null;

		Scanner sc = new Scanner(System.in);

		try {

			str = sc.next();
			
			System.out.println(firstRepeat(str));

		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
}


