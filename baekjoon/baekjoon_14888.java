package algorithmStudy;

import java.util.Scanner;

public class baekjoon_14888 {
	public static int[] a;
	public static int[] operator = new int[4];
	public static int min = 1000000001;
	public static int max = -1000000001;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < operator.length; i++) {
			operator[i] = scanner.nextInt();
		}
		
		dfs(a[0], 1);
		
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public static void dfs(int num, int dept) {
		if(dept == a.length) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			
			return;
		}
		
		for(int i = 0; i < operator.length; i++) {
			if(operator[i] > 0) {
				operator[i]--;
				
				if(i == 0)
					dfs(num + a[dept], dept + 1);
				else if(i == 1)
					dfs(num - a[dept], dept + 1);
				else if(i == 2)
					dfs(num * a[dept], dept + 1);
				else
					dfs(num / a[dept], dept + 1);
				
				operator[i]++;
			}
		}
	}
}
