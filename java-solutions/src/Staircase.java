import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) throws InterruptedException {

		String iterString = null;
		int N = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word, or symbol, you would like to turn into a staircase:");
		iterString = sc.next();
		System.out.println("Please enter how many stairs you would like to make:");
		N = sc.nextInt();	

		System.out.println("\n");
		
		for(int i = 1; i < N+1; i++) {
			stairCase(i, iterString);
			System.out.print("\n");
		}

	}

	public static void stairCase(int N, String iterString) throws InterruptedException {

		for(int i = 0; i < N; i++) {
			Thread.sleep(100);
			System.out.print(iterString);
		}
	}

}
