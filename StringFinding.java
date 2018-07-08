import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringFinding {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
						
			String line = br.readLine();
			String pce = br.readLine();

			if(line.contains(pce)) {			
				System.out.println(line.indexOf(pce));

			} else {
				System.out.println("-1");
			}

		} catch (IOException e) {

		}

	}

}


