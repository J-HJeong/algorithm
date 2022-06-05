package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class baekjoon_7662 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> q = new TreeMap<>();
			
			for(int j = 0; j < k; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				char ch = st.nextToken().charAt(0);
				int n = Integer.parseInt(st.nextToken());
				
				switch(ch) {
				case 'I':
					q.put(n, q.getOrDefault(n, 0) + 1);
					break;
				case 'D':
					int key = 0;
					
					if(q.isEmpty())
						break;
					if(n == 1)
						key = q.lastKey();
					else 
						key = q.firstKey();
					
					if(q.put(key, q.get(key) - 1) == 1)
						q.remove(key);
					
					break;
				}
			}
			
			if(q.isEmpty())
				sb.append("EMPTY\n");
			else
				sb.append(q.lastKey()).append(" ").append(q.firstKey()).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
