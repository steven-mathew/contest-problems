package DMOJ;

import java.util.Scanner;

public class CCCMultipleChoice {

		public static void main(String[] args) {

			int n = 0;

			Scanner sc = new Scanner(System.in);

			try{

				n = sc.nextInt();
				int c = 0;
				String[] x = new String[2*n];

				for(int i = 0; i < 2*n; i++){
					x[i] = sc.next();
				}
				
				for(int k = 0; k < n; k++){
					if(x[k].equals(x[k+n])){
//						System.out.println(x[k] + " " + x[k +n]);
						c++;	
					}	
				}
				
				System.out.println(c);
			} catch(Exception e){
				e.printStackTrace();
			}


		}


}
