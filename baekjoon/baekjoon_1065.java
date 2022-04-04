package algorithmStudy;

import java.util.Scanner;

public class baekjoon_1065 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 99;
		int hun = 0, ten = 0, one = 0;
		
		if(n < 100)
			System.out.println(n);
		else {
			if(n == 1000)
				--n;
			
			for(int i = 100; i <= n; i++) {
				hun = (i / 100);
				ten = (i / 10) % 10;
				one = i % 10;
				
				if((hun - ten) == (ten - one))
					count++;
			}
			
			System.out.println(count);
		}
		
		scanner.close();
	}
}
