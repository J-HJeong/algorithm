package algorithmStudy;

import java.util.Scanner;

public class baekjoon_1978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int check = 0, count = 0;

		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			check = 0;

			for (int j = 1; j <= num; j++) {
				if (num % j == 0)
					check++;
			}
			if (check == 2)
				count++;
		}
		
		System.out.print(count);
	}
}
