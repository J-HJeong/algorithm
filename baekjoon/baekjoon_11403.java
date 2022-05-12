package algorithmStudy;

import java.util.Scanner;

public class baekjoon_11403 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[][] graph = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				graph[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					if(graph[j][i] == 1 && graph[i][k] == 1)
						graph[j][k] = 1;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(graph[i][j]+" ");
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
