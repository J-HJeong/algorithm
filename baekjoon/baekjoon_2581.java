package algorithmStudy;

import java.util.Scanner;

public class baekjoon_2581 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int check = 0, sum = 0, min = n;
		
		for(int i = m; i <= n; i++) {
			check = 0;
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0)
					check++;
			}
			if(check == 2) {
				sum += i;
				if(min > i)
					min = i;
			}
		}
		
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
