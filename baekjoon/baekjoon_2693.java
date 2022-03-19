package algorithmStudy;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2693 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int t = scanner.nextInt();
		
		for(int i = 0 ; i < t ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				array[j] = scanner.nextInt();
			}
			Arrays.sort(array);
			System.out.println(array[7]);
		}
	}
}
