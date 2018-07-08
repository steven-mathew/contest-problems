import java.util.Scanner;

public class BTSBarambe {

	public static void main(String[] args) {

		String str = null;

		Scanner sc = new Scanner(System.in);	

		try {

			while(sc.hasNextLine()) {

				str = sc.nextLine();
				String[] word = str.split(" ");

				for(int i = 0; i < word.length - 1; i++) {
	
					if((!Character.isUpperCase(word[i].charAt(0))) && (Character.isUpperCase(word[i+1].charAt(0)))){
						word[i] += '.';
					}
					
					if((Character.isUpperCase(word[i].charAt(0))) && (Character.isUpperCase(word[i+1].charAt(0)))){
						word[i] += '.';
					}
					
					
					System.out.print(word[i] + " ");
						
				}
				
				System.out.print(word[word.length - 1] + ".");		
	
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
