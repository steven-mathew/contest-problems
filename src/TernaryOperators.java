public class TernaryOperators {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 2;

		int maxVal = (a > b) ? a : b;
		
		
		
		String result = (maxVal == a) ? "maxVal is equal to a" : "maxVal is equal to b";
		
		System.out.println(result);


	}

}
