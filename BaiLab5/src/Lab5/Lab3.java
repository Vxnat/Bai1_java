package Lab5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Bao Nhiêu Số :");
		 int n = sc.nextInt();
		int a[]  = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("Số Thứ " +(i+1) + ":");
			a[i] = sc.nextInt();
			q1.add(a[i]);
		}
		int max = 0;
		System.out.println("Hiển Thị Bao Nhiêu Số : ");
		int m = sc.nextInt();
		for (int i : q1) {
			if(max < m) {
			System.out.println(i);
			max++;
		}
			else break;
		
		
	}
}
}
