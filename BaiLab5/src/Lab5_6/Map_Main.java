package Lab5_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Main {
	public static void main(String[] args) {
		Map<Integer, SinhVien> map = new HashMap<>();
		System.out.println("--------Danh Sách Học Sinh");
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Số Học Sinh: ");
		n = sc.nextInt();
		sc.nextLine();
		
 		for (int i = 0; i < n; i++) {
 			SinhVien sv = new SinhVien();
			System.out.println("Học Sinh Thứ " +(i+1));
			sv.Nhap();
			map.put(i, sv);
		}
 		System.out.println("Nhấn Enter Để Hiện Thị Kết Quả:");
 		sc.nextLine();
 		
		for (SinhVien sinhVien : map.values()) {
			System.out.println(sinhVien);
			System.out.println();
		}
		
		int i = 0;
		System.out.println("Tìm Sinh Viên Dựa Theo Tên Lớp");
		System.out.println("Nhập Tên Lớp: ");
		String lop = sc.nextLine();
		System.out.println("Nhấn Enter Để Hiện Thị Kết Quả:");
 		sc.nextLine();
		for (SinhVien sinhVien : map.values()) {
			i++;
			if(sinhVien.getLop().equals(lop)) {
				System.out.println(sinhVien);
				System.out.println();
			}
			else if(i>=n) {
				System.out.println("Không Tìm Thấy");
			}
		}
		
		System.out.println();
		int a = 0;
		System.out.println("Tìm Sinh Viên Dựa Theo MSV");
		System.out.println("Nhập Mã Sinh Viên: ");
		String msv = sc.nextLine();
		System.out.println("Nhấn Enter Để Hiện Thị Kết Quả:");
 		sc.nextLine();
		for (SinhVien sinhVien : map.values()) {
			a++;
			if(sinhVien.getMsv().equals(msv)) {
				System.out.println(sinhVien);
				System.out.println();
				break;
			}
			else if(a>=n) {
				System.out.println("Không tìm thấy");
			}
		}
		
	}
}
