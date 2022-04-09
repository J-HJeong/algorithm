package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Stack{
	private int[] stack;
	private int size = 0;
	
	public Stack(int num) {
		stack = new int[num];
	}
	
	public void push(int num) {
		stack[size++] = num;
	}
	
	public int pop() {
		if(size == 0)
			return -1;
		else {
			int pop = stack[size-1];
			size--;
			return pop;
		}
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		if(size == 0)
			return 1;
		else
			return 0;
	}
	
	public int top() {
		if(size == 0)
			return -1;
		else
			return stack[size-1];
	}
}

public class baekjoon_10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Stack stack = new Stack(n);
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command) {
				case "push":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(stack.pop()).append("\n");
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				case "empty":
					sb.append(stack.empty()).append("\n");
					break;
				case "top":
					sb.append(stack.top()).append("\n");
					break;
			}
		}
		
		System.out.print(sb);
	}
}
