package algorithmStudy;

import java.util.Scanner;

public class baekjoon_2460 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int people = 0;
		int max = 0;
		
		for(int i = 0 ; i < 10 ; i ++) {
			int out = scanner.nextInt();
			int in = scanner.nextInt();
			
			people -= out;
			people += in;
			
			if(people > max)
				max = people;
		}
		
		System.out.println(max);
	}
}
