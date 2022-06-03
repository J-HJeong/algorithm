package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class baekjoon_7785 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			
			if(state.equals("enter"))
				set.add(name);
			if(state.equals("leave")) {
				if(set.contains(name))
					set.remove(name);
			}
		}
		
		ArrayList<String> list = new ArrayList<>(set);
		Collections.sort(list, Collections.reverseOrder());
		
		for(String name : list)
			System.out.println(name);
		
		br.close();
	}
}
