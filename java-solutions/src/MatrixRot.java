
public class MatrixRot {


	public static void printMatrix(int a[][], int N) {

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {	
				System.out.printf(a[i][j] + " ");
			}

			System.out.print("\n");			
		}

	}	

	public static void swapRows(int[][] m) {
		for (int  i = 0, k = m.length - 1; i < k; i++, k--) {
			int[] x = m[i];
			m[i] = m[k];
			m[k] = x;
		}
	}

	private static void transpose(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = i; j < m[0].length; j++) {
				int x = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = x;
			}
		}
	}

	public static void main(String[] args) {

		int a[][]= {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		int N = 3;

		transpose(a);
		swapRows(a);
		printMatrix(a, N);
	}

}
