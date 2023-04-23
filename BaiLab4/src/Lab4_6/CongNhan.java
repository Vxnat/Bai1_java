package Lab4_6;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class CongNhan {
	protected String hoTen , diaChi , ngaySinh ,loaiCongNhan;

	public CongNhan(String hoTen, String diaChi, String ngaySinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}
	
	Locale lc = new Locale("vi","VN");
	NumberFormat numd = NumberFormat.getCurrencyInstance(lc);//Đơn vị tiền tệ hiện tại
	
	Scanner sc = new Scanner(System.in);
	
	public void Nhap() {
		System.out.println("Nhập Họ Tên : ");
		hoTen = sc.nextLine();
		System.out.println("Nhập Địa Chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("Nhập Ngày Sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("Nhập Loại Công Nhân: ");
		loaiCongNhan = sc.nextLine();
	}
	public abstract double tinhLuong();
	
	public void In() {
		System.out.println("Họ Tên : " + hoTen);
		System.out.println("Địa Chỉ: " + diaChi);
		System.out.println("Ngày Sinh: " + ngaySinh);
		System.out.println("Loại Công Nhân: " + loaiCongNhan);
		System.out.println("$ Lương Tháng $ : " + numd.format(tinhLuong()));
	}
	
	
}
