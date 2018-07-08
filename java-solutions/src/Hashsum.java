import java.util.Arrays;

class Hashsum
{
	public static void main(String arg[]){
		
		int[] a = {5, 4, 5, 5, 6};
		int t = 20;
		
		
		Arrays.sort(a);
		
		int top = 0;
		int bot = a.length - 1;
		
		for(int i = 0; i < bot; i++) {
			
			for(int j = bot; j >= 0; j--) {
				
				int sum = a[i] + a[j];
				
				if (sum == t) {
					System.out.println(a[i] + " " + a[j]);
					System.exit(0);
				}
				
				if(sum < t) {
					i++;
				} 
				if (sum > t) {
					j--;
				}
				
			}
			
		}

	}
	
}