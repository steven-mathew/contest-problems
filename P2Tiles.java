import java.util.Scanner;

public class P2Tiles {
	public static void main(String[] args) {
		int w = 0;
		int l = 0;
		
		Scanner sc = new Scanner(System.in);

		try {
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] tokens = line.split(" ");

				w = Integer.parseInt(tokens[0]);
				l = Integer.parseInt(tokens[1]);
				
				String tile = sc.nextLine();
				int tileD = Integer.parseInt(tile);
				
				int output = (int) ((w/tileD)*(l/tileD));
				
				System.out.println(output);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
