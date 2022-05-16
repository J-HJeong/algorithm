package algorithmStudy;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon_10799 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		Stack<String> stack = new Stack<>();
		int num = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') 
				stack.push("(");
			
			else {
				stack.pop();
				
				if(input.charAt(i-1) == '(')
					num += stack.size();
				else 
					num++;
			}
		}
		
		System.out.println(num);
		scanner.close();
	}
}
