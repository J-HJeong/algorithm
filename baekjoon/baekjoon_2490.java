package algorithmStudy;

import java.util.Scanner;

public class baekjoon_2490 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zeroCount = 0;
		int[] yut = new int[4];
		
		for(int i = 0; i < 3; i++) {
			zeroCount = 0;
			for(int j = 0; j < 4; j++) {
				yut[j] = scanner.nextInt();
				if(yut[j] == 0)
					zeroCount++;
			}
			
			switch(zeroCount) {
			case 0:
				System.out.println("E");
				break;
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			}
		}
		
		scanner.close();
	}
}
