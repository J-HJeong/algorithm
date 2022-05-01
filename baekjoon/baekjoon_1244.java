package algorithmStudy;

import java.util.Scanner;

public class baekjoon_1244 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int switchNum = scanner.nextInt();
		int[] state = new int[switchNum+1];
		
		for(int i = 1; i <= switchNum; i++) {
			state[i] = scanner.nextInt();
		}
		
		int studentNum = scanner.nextInt();
		
		for(int i = 0; i < studentNum; i++) {
			int gender = scanner.nextInt();
			int num = scanner.nextInt();
			
			if(gender == 1) {
				for(int j = 1; j <= switchNum; j++) {
					if(j % num == 0)
						state[j] = state[j] == 0 ? 1 : 0;
				}
			}
			else {
				int count = 1;
				
				state[num] = state[num] == 0 ? 1 : 0;
				
				while((num - count) > 0 && (num + count) < state.length) {
					if(state[num - count] == state[num + count]) {
						state[num - count] = state[num - count] == 0 ? 1 : 0;
						state[num + count] = state[num + count] == 0 ? 1 : 0;
						
						count++;
					}
					else
						break;
				}
			}
		}
		
		for(int i = 1; i < state.length; i++) {
			System.out.print(state[i] + " ");
			
			if(i % 20 == 0)
				System.out.println();
		}
		
		scanner.close();
	}
}
