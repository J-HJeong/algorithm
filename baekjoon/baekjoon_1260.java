package algorithmStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_1260 {
	static int[][] connect;
	static boolean[] visited;
	static StringBuilder sb;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int v = scanner.nextInt();
		
		connect = new int[n+1][n+1];
		visited = new boolean[n+1];
		sb = new StringBuilder();
		
		for(int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			connect[x][y] = connect[y][x] = 1;
		}
		
		dfs(v, n);
		sb.append("\n");
		
		visited = new boolean[n+1];
		
		bfs(v, n);
		sb.append("\n");
		
		System.out.print(sb);
		scanner.close();
	}
	
	public static void dfs(int start, int n) {
		visited[start] = true;
		sb.append(start + " ");
		
		for(int i = 1; i <= n; i++) {
			if(connect[start][i] == 1 && visited[i] == false)
				dfs(i, n);
		}
	}
	
	public static void bfs(int start, int n) {
		Queue<Integer> queue = new LinkedList<>();
		
		visited[start] = true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			sb.append(temp + " ");
			
			for(int i = 1; i <= n; i++) {
				if(connect[temp][i] == 1 && visited[i] == false) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
