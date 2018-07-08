import java.util.Arrays;
import java.util.Scanner;

public class ASimpleMaximum {

	public static void main(String[] args) {

		int N = 0;


		Scanner sc = new Scanner(System.in);

		try {
			while(sc.hasNextLine()) {
				N = Integer.parseInt(sc.nextLine());
				String line = sc.nextLine();
				int arr[] = new int[N];
				
				String[] tokens = line.split(" ");
							
				for(int i = 0; i<N; i++) {
					arr[i] = Integer.parseInt(tokens[i]);						
				}
				
				Arrays.sort(arr);
				
				System.out.println(arr[0] + " " + arr[N-1]);
			}
			
			
		}
		catch(Exception e){

		}

	}


}
