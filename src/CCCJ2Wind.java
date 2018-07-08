import java.util.Scanner;

public class CCCJ2Wind {

	public static void main(String[] args) {
		
		int h, m;
		
		Scanner sc = new Scanner(System.in);
		try {
			h = sc.nextInt();
			m = sc.nextInt();
			
			if( alt(m,h)  > 0 ){
				System.out.print("The balloon does not touch ground in the given time.");
			}
			
			for(int i = 1; i < m; i++) {
				
				if ( alt(i, h) <= 0 ) {
					System.out.print("The balloon first touches ground at hour:" + "\n" + i);
					break;
				}
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static int alt(int t, int h) {
		int alt;
		alt = (-6*(t*t*t*t) + h*t*t*t + 2*t*t + t);
		
		return alt;
	}

}
