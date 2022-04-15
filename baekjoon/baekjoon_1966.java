package algorithmStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_1966 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num = scanner.nextInt();
		Queue<Integer> queue;
		int count;
		
		for(int i = 0; i < num; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			queue = new LinkedList<>();
			int[] priority = new int[n];
			
			for(int j = 0; j < n; j++) {
				queue.add(j);
				priority[j] = scanner.nextInt();
			}
			
			count = 0;
			while(true){
				int front = queue.poll();
				int max = 0;
				for(int j = 0; j < priority.length; j++) {
					if(max < priority[j])
						max = priority[j];
				}
				
				if(max == priority[front]) {
					count++;
					priority[front] = 0;
					if(m == front) {
						sb.append(count).append("\n");
						break;
					}
				}
				else {
					queue.offer(front);
				}

			}	
		}
		
		System.out.println(sb);
		scanner.close();
	}
}
