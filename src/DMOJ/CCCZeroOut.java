package DMOJ;

import java.util.Scanner;
import java.util.Stack;

public class CCCZeroOut {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);

			int dictated = Integer.parseInt(sc.nextLine());
			Stack a = new Stack<Integer>();
			for(int i = 0; i < dictated; i++){
				int num = Integer.parseInt(sc.nextLine());
				if (num == 0){
					a.pop();	
				}
				else{
					a.push(num);	
				}
			}
			
			Integer sum = 0;
			while(!a.isEmpty()){
				sum += (Integer)a.pop();
			}
			System.out.println(sum);

		}
		catch(Exception e){
			System.out.println("IO: General");
		}
	}

}


