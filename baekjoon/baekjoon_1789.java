package algorithmStudy;

import java.util.Scanner;

public class baekjoon_1789 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long s = scanner.nextLong();
		long sum = 0;
		int count = 0;
		
		while(sum <= s) {
			count++;
			sum += count;
		}
		
		if(sum > s)
			count--;
		
		System.out.println(count);
		scanner.close();
	}
}
