package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int m = Integer.parseInt(br.readLine());
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			left.push(str.charAt(i));
		}
		
		for(int i = 0; i < m; i++) {
			String command = br.readLine();
			switch(command.charAt(0)) {
			case 'L':
				if(!left.isEmpty())
					right.push(left.pop());
				break;
			case 'D':
				if(!right.isEmpty())
					left.push(right.pop());
				break;
			case 'B':
				if(!left.isEmpty())
					left.pop();
				break;
			case 'P':
				left.push(command.charAt(2));
				break;
			}
		}
		
		while(!left.isEmpty())
			right.push(left.pop());
		
		while(!right.isEmpty())
			sb.append(right.pop());
		
		System.out.print(sb);
		br.close();
	}
}
