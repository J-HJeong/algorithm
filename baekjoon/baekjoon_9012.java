package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < t; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(')
					stack.push(str.charAt(j));
				else {
					if(stack.empty()) {
						stack.push(str.charAt(j));
						break;
					}
					else
						stack.pop();
				}
			}
			
			if(stack.empty())
				sb.append("YES").append("\n");
			else
				sb.append("NO").append("\n");
			
			stack.clear();
		}
		
		System.out.print(sb);
		br.close();
	}
}
