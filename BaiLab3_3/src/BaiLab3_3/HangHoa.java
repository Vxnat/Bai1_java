package BaiLab3_3;

import java.util.Scanner;

public class HangHoa {
	private String maHang,tenHang,nhaSanXuat;
	private float gia;
	
	public HangHoa(String maHang, String tenHang, String nhaSanXuat, float gia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}

	Scanner sc = new Scanner(System.in);
	public void Nhap() {
		System.out.println("🏷️ Nhập mã hàng : ");
		maHang = sc.nextLine();
		System.out.println("🔠 Nhập tên hàng : ");
		tenHang = sc.nextLine();
		System.out.println("🏭 Nhập nhà sản xuất : ");
		nhaSanXuat = sc.nextLine();
		System.out.println("💲 Nhập giá : ");
		gia = sc.nextFloat();
	}
	
	public String toString() {
		return "🏷️ Mã Hàng : " +maHang+ " || " + "🔠 Tên Hàng : " +tenHang+ " || " + "🏭 Nhà Sản Xuất : " +nhaSanXuat+ " || " + "💲 Giá : " + gia;
	}
}
