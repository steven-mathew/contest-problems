package RTE;

import java.util.Scanner;

public class RTE_16_J1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] s_char_space = s.toCharArray();
		
		int len = s.length();
		int count = 0;
		
		char[] s_char = new char[s.length()];
		
		int l_count = 0;
		
		int count_s = 0;
		for(int i = 0; i < len; i++) {
			if(s_char_space[i] != ' ') {
				s_char[count_s++] = s_char_space[i];
				if(s_char_space[i] == 'L') {
					l_count++;
				}
			}
		}
						
		int max = 0;
		
		for(int i = 0; i < len; i++) {
			int cur_count = 1;
			for(int j = i + 1; j < len; j++) {
				if(s_char[i] != s_char[j]) {
					break;
				}
				cur_count++;
			}
			
			if(cur_count > count) {
				count = cur_count;
				max = count;
			}
		}
				
		System.out.println(l_count + " " + max);

	}

}
