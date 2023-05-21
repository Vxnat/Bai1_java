package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Số Nguyên: ");
			n = sc.nextInt();
		}
		list.add(n);
		boolean kiemTra = false;
		char chars[] = String.valueOf(n).toCharArray();
		
		for (int i = 0; i < chars.length/2; i++) {
			if(chars[i] != chars[chars.length-i-1]) {
				kiemTra = true;
				break;
			}
			
		}
		if(!kiemTra) System.out.println(n + " Là Số Thuận Nghịch");
		else System.out.println(n+ " Không Phải Số Thuận Nghịch");
}
}
