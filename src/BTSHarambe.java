import java.util.Scanner;

public class BTSHarambe {

	public static void main(String[] args) {

		String str = null;
		int upperCase = 0;
		int lowerCase = 0;

		try {

			Scanner sc = new Scanner(System.in);

			while(sc.hasNextLine()) {
				str = sc.nextLine();


				for(int i = 0; i < str.length(); i++) {
					if (Character.isUpperCase(str.charAt(i))){
						upperCase++;
					} else if (Character.isLowerCase(str.charAt(i))) {
						lowerCase++;
					}
				}

				boolean upperMax = (upperCase > lowerCase) ? true : false;

				if(upperCase != lowerCase) {
					if (upperMax) {
						System.out.println(str.toUpperCase());
					} else {
						System.out.println(str.toLowerCase());
					} 
				} else {
					System.out.println(str);
				}

				upperCase = 0;
				lowerCase = 0;
			}


		} catch(Exception e) {
			e.printStackTrace();
		}



	}

}
