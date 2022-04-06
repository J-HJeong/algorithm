package algorithmStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1316 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = n;
		char prev = 0;
		
		scanner.nextLine();
		for(int i = 0; i< n; i++) {
			String word = scanner.nextLine();
			ArrayList<Character> compare = new ArrayList<>();
			prev = 0;
			
			for(int j = 0; j < word.length(); j++) {
				char now = word.charAt(j);
				if(prev != now) {
					if(compare.contains(now)) {
						count--;
						break;
					}
					
					compare.add(now);
					prev = now;
				}
			}
		}
		
		System.out.println(count);
		scanner.close();
	}
}
