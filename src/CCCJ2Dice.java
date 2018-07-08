import java.util.Scanner;

public class CCCJ2Dice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = 0;
		
		try{
			
				int d1 = sc.nextInt();
				int d2 = sc.nextInt();
				
				int[][] arr = new int[d1+1][d2+1];
				
				for(int i = 1; i < d1+1; i++) {
					
					for(int j = 1; j < d2+1; j++) {
						
						arr[i][j] += i;
						arr[i][j] += j;
					}
				}
				
				for(int k = 0; k < d1+1; k++) {
					
					for(int l = 0; l < d2+1; l++) {
						
						if(arr[k][l] == 10) {
							c++;
						}
					}
				}
				
				if(c != 1) {
					System.out.println("There are " + c + " ways to get the sum 10.");
				} else {
					System.out.println("There is 1 way to get the sum 10.");
				}
				
//				for (int[] x : arr)
//				{
//				   for (int y : x)
//				   {
//				        System.out.print(y + " ");
//				   }
//				   System.out.println();
//				}
//				
							
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
