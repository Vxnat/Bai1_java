package BaiLab3_3;

public class HangSanhSu extends HangHoa {

	private String loaiNguyenLieu;
	
	public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, float gia,String loaiNguyenLieu) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	HangHoa hh1 = new HangHoa(null, null, null, 0);
	public void Nhap() {
		hh1.Nhap();
		System.out.println("🛒 Nhập loại nguyên liệu : ");
		loaiNguyenLieu = sc.nextLine();
	}
	
	public String toString() {
		return "🍽 Hàng Sành Sứ ➡️ " +hh1.toString() + " || " + "🛒 Loại Nguyên Liệu : " + loaiNguyenLieu;
	}
	
}
