package algorithmStudy;

import java.util.Scanner;

public class baekjoon_10798 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] word = new char[5][15];
		
		for(int i = 0; i < word.length; i++) {
			String str = scanner.nextLine();
			for(int j = 0; j < str.length(); j++) {
				word[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < word[0].length; i++) {
			for(int j = 0; j < word.length; j++) {
				if(word[j][i] == '\0')
					continue;
				System.out.print(word[j][i]);
			}
		}
		
		scanner.close();
	}
}
