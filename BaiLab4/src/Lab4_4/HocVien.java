package Lab4_4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class HocVien {
	
	protected String hoTen , diaChi,loaiChuongTrinhDangKy;
	protected int loaiUuTien;
	
	Scanner sc = new Scanner(System.in);
	
	Locale lc = new Locale("vi","VN");
	NumberFormat numd = NumberFormat.getCurrencyInstance(lc);//Đơn vị tiền tệ hiện tại
	
	
	public HocVien(String hoTen, String diaChi, String loaiChuongTrinhDangKy, int loaiUuTien) {

		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiChuongTrinhDangKy = loaiChuongTrinhDangKy;
		this.loaiUuTien = loaiUuTien;
	}
	
	

	public void Nhap() {
		System.out.println("Nhập Họ Tên : ");
		hoTen = sc.nextLine();
		System.out.println("Nhập Địa Chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("Nhập Loại Ưu Tiên: ");
		loaiUuTien = sc.nextInt();
		sc.nextLine();
		System.out.println("Loại Chương Trình Đăng Ký: ");
		loaiChuongTrinhDangKy = sc.nextLine();
	}

	public abstract float hocPhi();
	
	public void In() {
		System.out.println("Họ Tên : " + hoTen);
		System.out.println("Địa Chỉ: " + diaChi);
		System.out.println("Loại Ưu Tiên: " + loaiUuTien);
		System.out.println("Loại Chương Trình Đăng Kí Học: " + loaiChuongTrinhDangKy);
		System.out.println("*** Học Phí : " + numd.format(hocPhi()));
	}
	
	
	
	
}
