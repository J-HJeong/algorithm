package algorithmStudy;

import java.util.Scanner;

public class baekjoon_9095 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n, t = scanner.nextInt();
		int[] dp = new int[11];
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i < 11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for(int i = 0; i < t; i++) {
			n = scanner.nextInt();
			sb.append(dp[n] + "\n");
		}
		
		System.out.print(sb);
		scanner.close();
	}
}
