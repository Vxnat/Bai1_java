package Lab5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n[]  = new int [5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Nhập số nguyên " +(i+1) + ":");
			n[i] = sc.nextInt();
			q1.add(n[i]);
		}
		int max = 0;
		System.out.println("Bạn Muốn Hiển Thị Bao Nhiêu Số : ");
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
