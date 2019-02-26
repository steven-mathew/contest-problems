import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Addition {
	public static void main(String[] args) {
		String str = null;
		int n1 = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				
		try {
			str = br.readLine();
			String[] tokens = str.split(" -> ");
			
			for(int i = tokens.length - 1; i >= 0; i--) {				
				n1 += Integer.parseInt(tokens[i])*Math.pow(10, i);		
			}
			System.out.println(n1);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
