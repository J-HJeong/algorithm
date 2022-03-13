package algorithmStudy;

import java.util.Scanner;

public class baekjoon_2501 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			if(n % i == 0)
				k--;
			if(k == 0) {
				System.out.println(i);
				break;
			}
		}
		
		if(k != 0)
			System.out.println(0);
	}
}
