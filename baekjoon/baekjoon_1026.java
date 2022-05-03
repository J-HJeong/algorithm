package algorithmStudy;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1026 {
	public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        
        int[] a = new int[n];
        int[] b = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i = 0; i < n; i++) {
            s += a[i] * b[n-1-i];
        }
        
        System.out.println(s);
        scanner.close();
    }
}
