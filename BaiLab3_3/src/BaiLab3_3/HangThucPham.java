package BaiLab3_3;

public class HangThucPham extends HangHoa {

	private NgayThang ngaySanXuat,ngayHetHan;
	
	public HangThucPham(String maHang, String tenHang, String nhaSanXuat, float gia, NgayThang ngaySanXuat , NgayThang ngayHetHan) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	
	HangHoa hh1 = new HangHoa(null, null, null, 0);
	NgayThang nt1 = new NgayThang(0, 0, 0);
	NgayThang nt2 = new NgayThang(0, 0, 0);
	public void Nhap() {
		hh1.Nhap();
		System.out.println("⏳ Ngày sản xuất ⇩ ");
		nt1.Nhap();
		System.out.println("⌛️ Ngày hết hạn ⇩ ");
		nt2.Nhap();
	}
	
	public String toString() {
		return "🍕 Hàng Thực Phẩm ➡️ "+hh1.toString() + " || " + "⏳ Ngày Sản Xuất : " + nt1.toString() + " || " + "⌛️ Ngày Hết Hạn : " + nt2.toString();
	}
}
