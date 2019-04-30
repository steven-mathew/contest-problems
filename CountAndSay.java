public class CountAndSay {
	public static void main(String[] args) {
		
		int N = 4;
		
		String str = "1";
		for(int i = 2; i <= N; i++) {
			StringBuilder temp = new StringBuilder();
			char prev = str.charAt(0);
			int counter = 1;
			for(int j = 1; j < str.length(); j++) {
				char ch = str.charAt(j);
				if(ch != prev) {
					temp.append(counter);
					temp.append(prev);
					counter = 1;
					prev = ch;
				} else {
					counter++;
				}
			}
			temp.append(counter);
			temp.append(prev);
			str = temp.toString();
			
		}
		
		System.out.println(str);
		
	}
}
