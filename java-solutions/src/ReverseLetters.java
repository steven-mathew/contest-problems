import java.util.Scanner;

public class ReverseLetters {

	public static void main(String[] args) {
		
		//init input string to default val
		String word = null;
		
		try {

			//init scanner
			Scanner sc = new Scanner(System.in);
			
			//init vars, user input
			System.out.println("Please type a string, or text, that has an even amount of letters: ");
			word = sc.nextLine();
			char letters[] = new char[word.length()];
	
			//error check for input
			if(word.equals("")) {
				System.err.println("You didn't enter anything. Please try again");
			}	
			
			//word to char array		
			for(int i = 0; i < letters.length; i++) {
				letters[i] = word.charAt(i);
			}
			
			//decisions for checking if string is a-z, A-Z, and if even length; output
			if (word.matches("[a-zA-Z]+")) {
				if (word.length() % 2 == 0) {
					int subStringIndex = word.length()/2 - 1;
					String subStringMiddle = word.substring(subStringIndex, subStringIndex+2+1);
					printBackwards(subStringMiddle, 2);
					System.out.println("The letters above are the two middle letters in the string " + "\"" + word + "\"" + " printed backwards.");
				} else {
					System.err.println("Please input a word with an even amount of letters.");
				}
			} else if (!word.equals("")){
				System.err.println("String can only contain characters a-z, A-Z");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//method to print string in reverse with implicit param string, length
	public static void printBackwards(String letters, int size) {
		for(int k = size - 1; k >= 0; k--) {
			System.out.println(letters.charAt(k));
		}
	}

}
