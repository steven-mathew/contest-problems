import java.util.Scanner;

public class BinaryProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		while(sc.hasNextLine()) {

			for(int i = 0; i < n; i++) {

				int n1 = Integer.parseInt(sc.nextLine());
				String n2 = Integer.toBinaryString(n1);

				//display number and a tab
				System.out.print(n1 + "\t");

				//shift number 31 bits left

				//loop and print either 1 or 0
				for(int k= n2.length() - 1; k>=0; k--) {
					if( ((1 << k)&n1) != 0)
						System.out.print(1);
					else
						System.out.print(0);

					//every four bits print a space
					if( (k % 4) == 0 )
						System.out.print(" ");            

				}
				//print new line
				System.out.println();
			}


		}



	}

}






