package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class baekjoon_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> nameSet = new HashSet<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		for(int i = 0; i < n ; i++) {
			nameSet.add(br.readLine());
		}
		
		for(int i = 0; i < m; i++) {
			String name = br.readLine();
			
			if(nameSet.contains(name))
				nameList.add(name);
		}
		
		Collections.sort(nameList);
		System.out.println(nameList.size());
		
		for(int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		
		br.close();
	}
}
