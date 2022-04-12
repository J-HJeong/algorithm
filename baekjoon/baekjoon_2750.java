package algorithmStudy;

import java.util.Scanner;

public class baekjoon_2750 {
	static int[] num;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		
		// 선택 정렬
		// selectionSort(n);
		
		// 삽입 정렬
		// insertionSort(n);
		
		// 버블 정렬
		// bubbleSort(n);
		
		// 합병 정렬
		// mergeSort(0, n-1);
		
		// 퀵 정렬
		quickSort(0, n-1);
		
		for(int i = 0; i < n; i++) {
			System.out.println(num[i]);
		}
	}
	
	public static void selectionSort(int n) {
		int min_index;
		
		for(int i = 0; i < n - 1; i++) {
			min_index = i;
			for(int j = i + 1; j < n; j++) {
				if(num[j] < num[min_index])
					min_index = j;
			}
			int temp = num[min_index];
			num[min_index] = num[i];
			num[i] = temp;
		}
	}
	
	public static void insertionSort(int n) {
		for(int i = 1; i < n; i++) {
			int target = num[i];
			int j = i - 1;
			
			while(j >= 0 && target < num[j]) {
				num[j+1] = num[j];
				j--;
			}
			
			num[j+1] = target;
		}
	}
	
	public static void bubbleSort(int n) {
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n - 1; j++) {
				if(num[j] > num[j+1]) {
					int temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
				}	
			}
		}
	}
	
	public static void mergeSort(int left, int right) {
		int[] temp = new int[num.length];
		
		for(int i = 1; i <= right; i+=i) {
			for(int j = 0; j <= right - i; j += (2 * i)) {
				int low = j;
				int mid = j + i - 1;
				int high = Math.min(j + (2 * i) - 1, right);
				
				int l = low;
				int r = mid + 1;
				int index = low;
				
				while(l <= mid && r <= high) {
					if(num[l] <= num[r]) 
						temp[index++] = num[l++];
					else
						temp[index++] = num[r++];
				}
				
				if(l > mid) {
					while(r <= high)
						temp[index++] = num[r++];
				}
				else {
					while(l <= mid) 
						temp[index++] = num[l++];
				}
				
				for(int k = low; k <= high; k++) {
					num[k] = temp[k];
				}
			}
		}
		
		temp = null;
	}
	
	public static void quickSort(int left, int right) {
		int l = left;
		int r = right;
		int pivot = num[(left + right) / 2];
		
		do {
			while(num[l] < pivot)
				l++;
			while(num[r] > pivot)
				r--;
			if(l <= r) {
				int temp = num[l];
				num[l++] = num[r];
				num[r--] = temp;
			}
		} while(l <= r);
		
		if(left < r)
			quickSort(left, r);
		
		if(right > l)
			quickSort(l, right);
	}
}
