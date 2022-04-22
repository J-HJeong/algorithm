package algorithmStudy;

import java.util.Scanner;

public class baekjoon_2644 {
	static int[][] relation;
	static boolean[] visited;
	static int count = -1;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		int m = scanner.nextInt();
		
		relation = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			relation[x][y] = relation[y][x] = 1;
		}
		
		dfs(n, p1, p2, 0);
		System.out.println(count);
		
		scanner.close();
	}

	public static void dfs(int n, int p1, int p2, int cnt) {
		visited[p1] = true;
		
		if(p1 == p2) {
			count = cnt;
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(relation[p1][i] == 1 && !visited[i])
				dfs(n, i, p2, cnt + 1);
		}
	}
}
