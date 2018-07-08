package DMOPC;

import java.util.ArrayList;
import java.util.Scanner;

public class DMOPC_14_P3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int I = Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> students = new ArrayList<>();
		
		for(int i = 0; i < I; i++) {
			students.add(Integer.parseInt(sc.nextLine()));
		}
		
		int S = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < S; i++) {
			students.add(Integer.parseInt(sc.nextLine()));
			
			double avg = students
		            .stream()
		            .mapToDouble(a -> a)
		            .average()
		            .getAsDouble();
		            
			System.out.println(String.format("%.5f", avg));
				
		}
	}

}
