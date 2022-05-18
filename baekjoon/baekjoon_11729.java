package algorithmStudy;

import java.util.Scanner;

public class baekjoon_11729 {
	static StringBuilder sb;
	static int count;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		count = 0;
		sb = new StringBuilder();
		
		move(n, 1, 2, 3);
		
		System.out.println(count);
		System.out.print(sb);
		
		scanner.close();
	}
	
	public static void move(int n, int from, int temp, int to) {
		count++;
		
		if(n == 1)
			sb.append(from + " " + to +"\n");
		else {
			move(n-1, from, to, temp);
			sb.append(from + " " + to + "\n");
			move(n-1, temp, from, to);
		}
	}
}
