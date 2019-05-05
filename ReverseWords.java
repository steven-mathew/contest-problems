import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		String str = null;

		try {
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();	
			String[] word = str.split(" ");
			
			for(int i = word.length - 1; i >= 0; i--) {
				System.out.print(word[i] + " ");	
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
