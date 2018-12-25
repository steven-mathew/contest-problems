import java.util.Scanner;

public class System0 {
	public static void main(String... args) {	
		Scanner sc = new Scanner(System.in);		
		int n = Integer.parseInt(sc.nextLine());
		
		float[] coeff = new float[n];
		
		for(int i = 0; i < n; i++) {			
			coeff[i] = Float.parseFloat(sc.nextLine());						
		}
				
		//-c/a/n			
		if(coeff.length < 2) {
			System.out.printf("%.9f", -coeff[0] / coeff[0] / n );
		} else {
			System.out.printf("%.9f", -coeff[1] / coeff[0] / n );
		}
	}
}
