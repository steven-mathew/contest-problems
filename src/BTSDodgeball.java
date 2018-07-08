import java.util.Scanner;

public class BTSDodgeball {

	public static void main(String[] args) {

		int N = 0;
		int counter = 0;

		try {

			Scanner sc = new Scanner(System.in);

			while(sc.hasNextLine()) {
				
				//num of words
				N = Integer.parseInt(sc.nextLine());

				//tokenize
				String line = sc.nextLine();
				String[] token = line.split(" ");
			

				//set counter to N
				counter = N;

				//logic
				for(int i = 0; i < N - 1; i++) {

					for(int j = 1; j < N - i - 1; j++) {

						char c1 = token[i].charAt(0);
						char c2 = token[i + j].charAt(0);

						if (Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
							counter++;
						}
						
					}

				}

				//mod 10^9 + 7
				System.out.println((counter) % 1000000007);

				//reset
				N = 0;
				counter = 0;

			}

		} catch(Exception e) {
			
			e.printStackTrace();

		}


	}

}
