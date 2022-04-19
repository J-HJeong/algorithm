package algorithmStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon_2667 {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static boolean[][] visited;
	static ArrayList<Integer> house;
	static int count;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		map = new int[n][n];
		visited = new boolean[n][n];
		house = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String temp = scanner.next();
			for(int j = 0; j < n; j++) {
				map[i][j] = temp.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					count = 1;
					dfs(i, j, n); 
					house.add(count);
				}		
			}
		}
		
		Collections.sort(house);
		System.out.println(house.size());
		
		for(int i = 0; i < house.size(); i++) {
			System.out.println(house.get(i));
		}
		
		scanner.close();
	}
	
	public static void dfs(int i, int j, int n) {
		visited[i][j] = true;
		
		for(int k = 0; k < 4; k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			
			if(x >= 0 && x < n && y >= 0 && y < n) {
				if(map[x][y] == 1 && !visited[x][y]) { 
					dfs(x, y, n);
					count++;
				}
			}
		}
	}
}
