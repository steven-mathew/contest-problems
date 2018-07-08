package DMOJ;

import java.util.Scanner;

public class DMOJLexoLeast {
   public static void main(String[] args) {
	    // TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    String inputString = sc.nextLine();
	    int length = sc.nextInt();
	    String smallest="";
	    for(int i = 0;i<=inputString.length()-length;i++){
	        String subString = inputString.substring(i,i+length);
	        if(i == 0){
	            smallest = subString;
	        }
	        
	        if(subString.compareTo(smallest)<0)
	            smallest = subString;
	    }
	    System.out.println(smallest);
	}
}
