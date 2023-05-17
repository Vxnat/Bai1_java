package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab7_MyArrayList {
	public static void main(String[] args) {
		ArrayList<Object> a1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int a ;
		System.out.println("Nhập Số Nguyên: ");
		a = sc.nextInt();
		sc.nextLine();
		a1.add(a);
		float b;
		System.out.println("Nhập Số Thực: ");
		b = sc.nextFloat();
		sc.nextLine();
		a1.add(b);
		boolean c;
		System.out.println("Nhập Giá trị Boolean: ");
		c = sc.nextBoolean();
		sc.nextLine();
		a1.add(c);
		String d;
		System.out.println("Nhập 1 chuỗi :");
		d = sc.nextLine();
		a1.add(d);
		
		for (Object object : a1) {
			System.out.println(object );
			
		}
		
		
	}
}
