package Lab4_5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen, diaChi,loaiGiangVien;

	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}
	
	Locale lc = new Locale("vi","VN");
	NumberFormat numd = NumberFormat.getCurrencyInstance(lc);//Đơn vị tiền tệ hiện tại
	 
	Scanner sc = new Scanner(System.in);
	
	public void Nhap() {
		System.out.println("Nhập Họ Tên : ");
		hoTen = sc.nextLine();
		System.out.println("Nhập Địa Chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("Nhập Loại Giảng Viên: ");
		loaiGiangVien = sc.nextLine();
	}
	
	public abstract double tinhLuong();
	
	public void In() {
		System.out.println("Họ Tên : " + hoTen);
		System.out.println("Địa Chỉ: " + diaChi);
		System.out.println("Loại Giảng Viên : " + loaiGiangVien);
		System.out.println("Lương Tháng: " + numd.format(tinhLuong()));
	}
	
}
