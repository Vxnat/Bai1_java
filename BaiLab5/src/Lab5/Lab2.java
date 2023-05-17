package Lab5;

import java.util.Scanner;
import java.util.Stack;

public class Lab2 {
	public static void main(String[] args) {
		Stack<Integer> soNguyen = new Stack<Integer>();
		int n[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
			for (int i = 0; i < 5; i++) {
				System.out.println("Nhập số nguyên " +(i+1) + ":");
				n[i] = sc.nextInt();
				soNguyen.add(n[i]);
			}
		
		System.out.println("Nhập Số Phần Tử Muốn Hiển Thị Ra Màn Hình : ");
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			// Lấy Phần Tử Trên Cùng Của Stack
			System.out.println(soNguyen.pop() + " ");
		}
	}
}
