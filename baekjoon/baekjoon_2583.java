package algorithmStudy;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_2583 {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] map;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		ArrayList<Integer> areaList = new ArrayList<>();
		int count = 0;
		
		map = new int[m][n];
		visited = new boolean[m][n];
		
		for(int i = 0; i < k; i++) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			
			for(int j = y1; j < y2; j++) {
				for(int l = x1; l < x2; l++){
					map[j][l] = 1;
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j] && map[i][j] == 0) {
					areaList.add(bfs(i, j, m, n));
					count++;
				}
			}
		}
		
		Collections.sort(areaList);
		
		System.out.println(count);
		for(int i = 0; i < areaList.size(); i++) {
			System.out.print(areaList.get(i) + " ");
		}
		
		scanner.close();
	}
	
	public static int bfs(int x, int y, int m, int n) {
		Queue<Point> queue = new LinkedList<>();
		Point point = new Point(x, y);
		int area = 1;
		
		queue.add(point);
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			Point temp = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int xx = temp.x + dx[i];
				int yy = temp.y + dy[i];
				
				if(xx >= 0 && yy >= 0 && xx < m && yy < n) {
					if(!visited[xx][yy] && map[xx][yy] == 0) {
						visited[xx][yy] = true;
						Point next = new Point(xx, yy);
						queue.add(next);
						area++;
					}
				}
			}
		}
		
		return area;
	}
}
