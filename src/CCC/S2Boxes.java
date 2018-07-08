package CCC;

import java.util.Arrays;
import java.util.Scanner;

public class S2Boxes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int[] b = new int[3];
		int[][] dim_box = new int[n][3];

		for(int i = 0; i < n; i++) {

			String s = sc.nextLine();
			String[] t = s.split(" ");

			for(int j = 0; j < 3; j++) {
				b[j] = Integer.parseInt(t[j]);
				//				System.out.println(b[j]);

				dim_box[i][j] = Integer.parseInt(t[j]);
//				System.out.println(dim_box[i][j]);		
				//				Arrays.sort(dim_box[i]);
			}

		}




		int m = Integer.parseInt(sc.nextLine());
		int[] item = new int[3];
		int[][] dim_item = new int[m][3];

		for(int k = 0; k < m; k++){

			String s2 = sc.nextLine();
			String[] t2 = s2.split(" ");

			for(int l = 0; l < 3; l++) {
				item[l] = Integer.parseInt(t2[l]);
				dim_item[k][l] = Integer.parseInt(t2[l]);
			}

		}

		for (int i = 0; i < dim_item.length; i++) {
			Arrays.sort(dim_item[i]);
		}

		for (int r = 0; r < dim_item.length; r++) {
			Arrays.sort(dim_item[r]);
		}

		boolean found = false;

		for(int h = 0; h < m; h++) {

			found = false;
			int v_box = 1;
			String output = "";
			
			for(int z = 0; z < n; z++) {
				if((dim_item[h][0] <= dim_box[z][0]) && (dim_item[h][1] <= dim_box[z][1]) && (dim_item[h][2] <= dim_box[z][2])){
					found = true;
					v_box = dim_box[z][0] * dim_box[z][1] * dim_box[z][2];
					output += v_box;
					break;
				} else {
					found = false;
				}

			}
			
			if(found) {
				System.out.println(output);
			} else {
				System.out.println("Item does not fit.");
			}
			
		}






	}





}
