package algorithmStudy;

import java.util.Scanner;

public class baekjoon_10818 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int max = -1000000; int min = 1000000;
		
		for(int i = 0 ; i < n ; i++) {
			int num = scanner.nextInt();
			
			if(max < num) {
				max = num;
			}
			
			if(min > num) {
				min = num;
			}
		}
		
		System.out.println(min + " " + max);
		
	}
}
