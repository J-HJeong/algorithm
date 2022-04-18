package algorithmStudy;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_2178 {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] maze;
	static boolean[][] visited;
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		maze = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			// 붙어서 입력 받으므로 
			String temp = scanner.next();
			for(int j = 0; j < m; j++) {
				// 아스키코드값 변환
				maze[i][j] = temp.charAt(j) - '0';
			}
		}
		
		bfs(n, m);
		System.out.println(maze[n-1][m-1]);
		
		scanner.close();
	}
	
	public static void bfs(int n, int m) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(0, 0));
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			Point point = queue.poll();
			
			for(int i = 0; i < 4; i ++) {
				int x = point.x + dx[i];
				int y = point.y + dy[i];
				
				if(x >= 0 && x < n && y >= 0 && y < m) {
					if(!visited[x][y] && maze[x][y] == 1) {
						queue.add(new Point(x, y));
						visited[x][y] = true;
						maze[x][y] = maze[point.x][point.y] + 1;
					}
				}
			}
		}
	}
}
