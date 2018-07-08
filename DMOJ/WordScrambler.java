package DMOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WordScrambler {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    String word = sc.nextLine();

	    ArrayList<Character> chars = new ArrayList<Character>(word.length());
	    
	    for(char c : word.toCharArray()) {
	       chars.add(c);
	    }
	    
	    int combos = fact(word.length());
	    
	    HashSet<String> h = new HashSet<>();
	    
	    while(h.size() < combos) {
	    	Collections.shuffle(chars);
   		
    		StringBuilder sb = new StringBuilder(); 
    		
    		for(char ch : chars)
    		  sb.append(ch);

    		word = sb.toString();
 	
	    	h.add(word);
	    }
	    
	    ArrayList<String> h_sort = new ArrayList<>(h);
	    Collections.sort(h_sort);
	    
	    for(String s : h_sort) {
    		System.out.println(s);
    	}
	   	    
	}
	
	public static int fact(int n) {
		
		if(n == 1) return 1;
		
		return n * fact(n - 1);	
	}


}
