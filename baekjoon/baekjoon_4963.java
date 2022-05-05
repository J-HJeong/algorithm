package algorithmStudy;

import java.util.Scanner;

public class baekjoon_4963 {
	static int[][] map;
	static boolean[][] visited; 
	static int dx[] = {1, -1, 0, 0, 1, 1, -1, -1};
    static int dy[] = {0, 0, 1, -1, 1, -1, 1, -1};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			int count = 0;
			
			if(w == 0 && h == 0)
				break;
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					map[i][j] = scanner.nextInt();
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(!visited[i][j] && map[i][j] == 1) {
						dfs(i, j, w, h);
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
		
		scanner.close();
	}
	
	public static void dfs(int x, int y, int w, int h) {
		visited[x][y] = true;
		
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < h && ny < w) {
				if(!visited[nx][ny] && map[nx][ny] == 1)
					dfs(nx, ny, w, h);
			}
		}
	}
}
