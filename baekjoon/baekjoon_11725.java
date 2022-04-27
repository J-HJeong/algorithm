package algorithmStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_11725 {
	static ArrayList<Integer>[] tree;
	static int[] parents;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		tree = new ArrayList[n+1];
		parents = new int[n+1];
		visited = new boolean[n+1];
		
		for(int i = 1; i <= n; i++)
			tree[i] = new ArrayList<>();
		
		for(int i = 1; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			tree[x].add(y);
			tree[y].add(x);
		}
		
		dfs(1, n);
		
		for(int i = 2; i <= n; i++) {
			System.out.println(parents[i]);
		}
		
		scanner.close();
	}
	
	public static void dfs(int node, int n) {
		visited[node] = true;
		
		for(int i = 0; i < tree[node].size() ; i++) {
			int temp = tree[node].get(i);
			
			if(!visited[temp]) {
				parents[temp] = node;
				dfs(temp, n);
			}
		}
	}
}
