package algorithmStudy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baekjoon_10814 {
	public static class User{
		private int age;
		private String name;
		
		public User(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		@Override
		public String toString() {
			return age + " " + name;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		User[] user = new User[n];
		
		for(int i = 0; i < n; i++) {
			user[i] = new User(scanner.nextInt(), scanner.next());
		}
		
		Arrays.sort(user, new Comparator<User>(){
			@Override
			public int compare(User user1, User user2) {
//				양의 정수일 경우만 두 객체의 위치를 바꾸어줌 
//				즉, 앞서 입력된 회원의 나이가 더 많을 경우 위치를 바꾸어줌
				return user1.getAge() - user2.getAge(); 
				  
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(user[i].toString());
		}
		
		scanner.close();
	}
}
