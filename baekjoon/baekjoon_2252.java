package algorithmStudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_2252 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] degree = new int[n+1];
		ArrayList<Integer>[] list = new ArrayList[n+1];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			list[a].add(b);
			degree[b]++;
		}
		
		for(int i = 1; i < n + 1; i++) {
			if(degree[i] == 0)
				queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			System.out.print(now + " ");
			
			for(int i = 0; i < list[now].size(); i++) {
				int next = list[now].get(i);
				degree[next]--;
				
				if(degree[next] == 0)
					queue.add(next);
			}
		}
	}
}
