package CCC;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ListMinimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for(int i = 0; i<N; i++) {
			queue.add(sc.nextInt());
		}

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
