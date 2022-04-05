package algorithmStudy;

import java.util.Scanner;

public class baekjoon_2606 {
	static int comp;
	static int node[][];
	static boolean check[];
	static int count= 0;
	
	public static void dfs(int start) {
		check[start] = true;
		
		for(int i = 1; i <= comp; i++) {
			if(node[start][i] == 1 && !check[i]) {
				count++;
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		comp = scanner.nextInt();
		int pair = scanner.nextInt();
		
		node = new int[comp+1][comp+1];
		check = new boolean[comp+1];
		
		for(int i = 0; i < pair; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			node[x][y] = 1;
			node[y][x] = 1;
		}
		
		dfs(1);
		System.out.println(count);
		
		scanner.close();
	}
}
