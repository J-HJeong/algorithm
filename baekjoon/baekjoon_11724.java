package algorithmStudy;

import java.util.Scanner;

public class baekjoon_11724 {
	static int[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int count = 0;
		
		graph = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			
			graph[u][v] = graph[v][u] = 1;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) {
				dfs(i, n);
				count++;
			}
		}
		
		System.out.println(count);
		scanner.close();
	}
	
	public static void dfs(int start, int n) {
		visited[start] = true;
		
		for(int i = 1; i <= n; i++) {
			if(graph[start][i] == 1 && !visited[i])
				dfs(i, n);
		}
	}
}
