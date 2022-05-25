package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class baekjoon_1302 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> bookMap = new HashMap<>();
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			String book = br.readLine();
			if(!bookMap.containsKey(book))
				bookMap.put(book, 1);
			else
				bookMap.replace(book, bookMap.get(book) + 1);
		}
		
		for(String book : bookMap.keySet()) {
			max = Math.max(max, bookMap.get(book));
		}
		
		Map<String, Integer> sortedMap = new TreeMap<>(bookMap);
		
		for(String book : sortedMap.keySet()) {
			if(sortedMap.get(book) == max) {
				System.out.println(book);
				break;
			}
		}
		
		br.close();
	}
}
