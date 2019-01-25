public class ECOOMountainView {

	public static void main(String[] args) {
		
		int[] x = {78,56,4,7};
		int s = x[0];
		
		for(int n : x) {
			if (n < s) {
				s = n;
			}
		}
		
		System.out.println(s);

	}

}
