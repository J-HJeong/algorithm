package algorithmStudy;

import java.util.Scanner;

public class baekjoon_5585 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int change = 1000 - scanner.nextInt();
		
		int[] coin = {500, 100, 50, 10, 5, 1};
		int result = 0;
		
		for(int i = 0; i < coin.length; i++) {
			int temp = change / coin[i];
			if(temp > 0) {
				result += temp;
				change -= temp * coin[i]; 
			}
		}
		
		System.out.println(result);
		scanner.close();
	}
}
