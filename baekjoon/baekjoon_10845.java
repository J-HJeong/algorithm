package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_10845 {
	public static class Queue{
		private int[] queue;
		private int size = 0;
		private int first = 0;
		private int last = -1;
		
		Queue(int n){
			queue = new int[n];
		}
		
		public void push(int num) {
			queue[++last] = num;
			size++;
		}
		
		public int pop() {
			if(size == 0)
				return -1;
			else {
				size--;
				return queue[first++];
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
		
		public int front() {
			if(size == 0)
				return -1;
			else
				return queue[first];
		}
		
		public int back() {
			if(size == 0)
				return -1;
			else
				return queue[last];
		}
	}
	
	public static void main(String[] args) throws IOException {
		// Scanner 사용 시 시간 초과
		// 속도가 더 빠른 BufferedReader 사용
		// Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int n = scanner.nextInt();
		int n = Integer.parseInt(br.readLine());
		Queue queue = new Queue(n);
		
		for(int i = 0; i < n; i++) {
			// String command = scanner.next();
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command){
			case "push":
				// queue.push(scanner.nextInt());
				queue.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				System.out.println(queue.pop());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				System.out.println(queue.empty());
				break;
			case "front":
				System.out.println(queue.front());
				break;
			case "back":
				System.out.println(queue.back());
				break;
			}
		}
		
		// scanner.close();
		br.close();
	}
}
