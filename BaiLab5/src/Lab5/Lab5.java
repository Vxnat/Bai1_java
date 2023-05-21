package Lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab5 {
	public static void main(String[] args) {
		Set<Float> f1 = new HashSet<Float>();
		Set<Float> f2 = new HashSet<Float>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Bao Nhiêu Số : ");
		int count = sc.nextInt();
		float n[] = new float[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Số Thứ " +(i+1) + ":");
			n[i] = sc.nextInt();
			f1.add(n[i]);
		}
		
		System.out.println("Nhập 1 Số Để Kiểm Tra : ");
		float a = sc.nextFloat();
		for (Float kiemTra : f1) {
			if(f1.contains(a)) {
				System.out.println("-> Có Tồn Tại Số " + a);
				break;
			}else {
				System.out.println("-> Không Tồn Tại Số " + a);
				break;
			
			}
		}
		
		System.out.println();
		
		Set<Float> f3 = new HashSet<Float>();
		System.out.println("Nhập Bao Nhiêu Số : ");
		count = sc.nextInt();
		float b[] = new float [count];
		for (int i = 0; i < count; i++) {
			System.out.println("Số Thứ " +(i+1) + ":");
			b[i] = sc.nextInt();
			if(f2.contains(b[i]) == false) {
				f2.add(b[i]);
				f3.add(b[i]);
			}
			else f3.remove(b[i]);
		}
		
		System.out.println("-> Sắp Xếp Nhỏ Dần Các Phần Tử Xuất Hiện 1 Lần : ");
		// Sắp Xếp Nhỏ Dần
		Set<Float> sapXep = new TreeSet(Comparator.reverseOrder());
		sapXep.addAll(f3);
		System.out.println(sapXep);
		
	}
}
