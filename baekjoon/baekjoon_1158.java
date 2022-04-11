package algorithmStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_1158 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		System.out.print("<");
		
		while(queue.size() > 1) {
			for(int i = 1; i < k; i++) {
				queue.offer(queue.poll());
			}
			
			System.out.print(queue.poll() + ", ");
		}
		
		System.out.println(queue.poll()+">");
		scanner.close();
	}
}
