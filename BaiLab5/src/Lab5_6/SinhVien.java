package Lab5_6;

import java.util.Scanner;

public class SinhVien {
	private String msv,hoten,lop;
	Scanner sc = new Scanner(System.in);
	
	public SinhVien() {
		
	}
	public SinhVien(String msv, String hoten, String lop) {
		this.msv = msv;
		this.hoten = hoten;
		this.lop = lop;
	}

	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
	public void Nhap() {
		System.out.println("Mã Sinh Viên: ");
		msv = sc.nextLine();
		System.out.println("Họ Tên: ");
		hoten = sc.nextLine();
		System.out.println("Lớp: ");
		lop = sc.nextLine();
	}
	
	public String toString() {
		return "Mã Sinh Viên: " + msv +"\n"
				+"Họ Tên: " + hoten + "\n"
				+"Lớp: " + lop ;
	}
	
	
}
