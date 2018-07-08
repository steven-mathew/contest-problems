import java.util.Scanner;

public class StringAssignment {

	public static void main(String[] args) {
		
		String word = null;
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a word: ");
			word = sc.nextLine();
			
			if (word.charAt(0) == 'C' || word.charAt(0) == 'c') {
				char firstLetter = word.charAt(0);
				String subStringC = word.substring(1);
				
				System.out.println(subStringC + firstLetter);
			} else if (word.length() % 2 != 0) {
				
				int middleLetterInd = (word.length()/2 + 1);
				char middleLetter = word.charAt(middleLetterInd);
				
				System.out.println(word.substring(0, middleLetterInd) + word.substring(middleLetterInd + 1, middleLetterInd +2) + (int) (middleLetter));
			
			} else if (word.length() % 2 == 0) {
				
				if (word.equalsIgnoreCase("java")){
					System.out.println("You selected the right program");
				} else if (word.substring(0,5).equalsIgnoreCase("milli")) {
					System.out.println( word.substring(5,word.length()) + word.substring(0,5) );
				} else {
					System.out.println("You failed to meet my conditions.");
				}
				
			}
			
	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
