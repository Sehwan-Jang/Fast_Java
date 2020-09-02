package chapter9_interface;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {

		Sort sort = null;
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : Bubble Sort");
		System.out.println("H : Heap Sort");
		System.out.println("Q : Quick Sort");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().toLowerCase().charAt(0);
		
		if(ch == 'b') {
			sort = new BubbleSort();
		} else if(ch == 'h') {
			sort = new HeapSort();
		} else if(ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("ERROR");
			sc.close();
			return;
		}
		
		int[] arr = {1,2,5,5,3};
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		sc.close();
	}

}
