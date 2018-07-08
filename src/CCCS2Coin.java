import java.util.Scanner;

public class CCCS2Coin {

	public static void main(String[] args) {
		
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			while(sc.hasNextLine()) {
				
				x = sc.nextInt();
				
				if(x != 0)
				System.out.println(calc(x));
						
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	 
	public static int calc(int r){
		int t = 0;
		for(int i = 1; i <= r; ++i){
			for(int j = 0; j <= r; ++j){
				if(i * i + j * j <= r * r)
					++t;
				else
					break;
			}
		}
		return 1 + 4 * t;
	}

}
