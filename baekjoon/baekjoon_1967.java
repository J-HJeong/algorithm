package algorithmStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1967 {
	static ArrayList<Node>[] tree;
	static boolean[] visited;
	static int maxDist = 0;
	static int maxNodeNum;
	
	static class Node{
		int number;
		int weight;
		
		Node(int number, int weight){
			this.number = number;
			this.weight = weight;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		tree = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i <= n; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			int parent = scanner.nextInt();
			int child = scanner.nextInt();
			int weight = scanner.nextInt();
			
			tree[parent].add(new Node(child, weight));
			tree[child].add(new Node(parent, weight));
		}
		
		dfs(1, 0);
		
		visited = new boolean[n+1];
		dfs(maxNodeNum, 0);
		
		System.out.println(maxDist);
		scanner.close();
	}
	
	public static void dfs(int start, int weight) {
		visited[start] = true;
		
		if(weight > maxDist) {
			maxDist = weight;
			maxNodeNum = start;
		}
		
		for(Node node : tree[start]) {
			if(!visited[node.number]) {
				visited[start] = true;
				dfs(node.number, weight + node.weight);
			}
		}
	}
}
