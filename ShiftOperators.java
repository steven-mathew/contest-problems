

public class ShiftOperators {
	public static void main(String[] args) throws InterruptedException {		
		int N = 100;
		
		System.out.println("\n");
		
		for(int i = 1; i < N; i++) {
			System.out.print(Integer.toBinaryString(i));
			Thread.sleep(N/i);
		}
	}
	
	public static void clearConsole() {
		for(int i = 0; i < 10; i++) {
			System.out.print("\n");
		}
	}	  
}
