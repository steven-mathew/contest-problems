import java.util.Scanner;

public class AddWithoutOperators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int N = Integer.parseInt(sc.nextLine());

			for(int i = 0; i < N; i++) {
				
				String str = sc.nextLine();
				String[] t = str.split(" ");
				
				System.out.println(sumOfTwoIntegers(Integer.parseInt(t[0]), Integer.parseInt(t[1])));
								
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static int sumOfTwoIntegers(int a, int b) {
		
		if (a == 0) return b;
		if (b == 0) return a;

		while(b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		
		return a;
	}

}
