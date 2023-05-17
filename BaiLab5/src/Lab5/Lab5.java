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
		float n[] = new float[5];
		float a;
		Set<Float> f1 = new HashSet<Float>();
		Set<Float> f2 = new HashSet<Float>();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Nhập số nguyên " +(i+1) + ":");
			n[i] = sc.nextInt();
			f1.add(n[i]);
		}
		System.out.println("Nhập 1 số : ");
		a = sc.nextFloat();
		
		for (Float kiemTra : f1) {
			if(f1.contains(a)) {
				System.out.println("Có Tồn Tại");
				break;
			}else {
				System.out.println("Không");
				break;
			
			}
		}
		float b[] = new float [5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Nhập số nguyên " +(i+1) + ":");
			b[i] = sc.nextInt();
			if(f2.contains(b[i]) == false) {
				f2.add(b[i]);
			}
			else f2.remove(b[i]);
		}
		System.out.println("Sắp Xếp Các Phần Tử Xuất Hiện 1 Lần : ");
		// Sắp Xếp Ngược 
		Set<Float> sapXep = new TreeSet(Comparator.reverseOrder());
		sapXep.addAll(f2);
		System.out.println(sapXep);
		
		
		
		
		
		
		
	}
}
