package BaiLab3_3;

import java.util.Scanner;

public class NgayThang {
	private int ngay,thang,nam;
	
	
	
	public NgayThang(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	Scanner sc = new Scanner(System.in);
	public void Nhap() {
		System.out.println("📅Nhập ngày : ");
		ngay = sc.nextInt();
		System.out.println("📅Nhập tháng : ");
		thang = sc.nextInt();
		System.out.println("📅Nhập năm : ");
		nam = sc.nextInt();
	}
	
	public String toString() {
		return ngay +"/" + thang +"/" +nam;
		
		
		
	}
}
