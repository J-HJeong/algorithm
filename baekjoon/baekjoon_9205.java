package algorithmStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_9205 {
	static Point[] points;
	static boolean[] visited;
	
	static class Point{
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			points = new Point[n+2];
			visited = new boolean[n+2];
			
			for(int j = 0; j < n+2; j++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				
				points[j] = new Point(x, y);
			}
			
			System.out.println(bfs(n) ? "happy" : "sad");
		}
		
		scanner.close();
	}
	
	public static boolean bfs(int n) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(points[0]);
		
		while(!queue.isEmpty()) {
			Point temp = queue.poll();
			
			if(temp.equals(points[n+1])) {
				return true;
			}
			
			for(int i = 1; i < n+2; i++) {
				if(!visited[i] && 
						Math.abs(temp.x - points[i].x) + Math.abs(temp.y - points[i].y) <= 1000) {
					queue.add(points[i]);
					visited[i] = true;
				}
			}
		}
		
		return false;
	}
}
