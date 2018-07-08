import java.util.Scanner;

public class BTSP2Crayola {

	public static void main(String[] args) {
		 	
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int c = 1;
			
			while(sc.hasNextLine()) {
				
				int n = Integer.parseInt(sc.nextLine());
				String str = sc.nextLine();
				String[] t = str.split(" ");
				
				for(int i = 0; i < t.length - 1; i++) {
							
					if(!t[i].equals(t[i+1])) {
						c++;
					}
								
				}
				
				System.out.println(c);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
