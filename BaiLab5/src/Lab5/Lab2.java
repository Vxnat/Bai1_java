package Lab5;

import java.util.Scanner;
import java.util.Stack;

public class Lab2 {
	public static void main(String[] args) {
		Stack<Integer> soNguyen = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Bao Nhiêu Số :");
		 int n = sc.nextInt();
		int a[] = new int[n];
		
			for (int i = 0; i < n; i++) {
				System.out.println("Số Thứ " +(i+1) + ":");
				a[i] = sc.nextInt();
				soNguyen.add(a[i]);
			}
		
		System.out.println("Muốn Hiển Thị Bao Nhiêu Số : ");
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			// Lấy Phần Tử Trên Cùng Của Stack
			System.out.println(soNguyen.pop() + " ");
		}
	}
}
