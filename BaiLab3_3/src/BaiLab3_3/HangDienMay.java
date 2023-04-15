package BaiLab3_3;

public class HangDienMay extends HangHoa {
	private String thoiGianBaoHanh;
	private int dienAp;
	private float congSuat;
	
	
	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, float gia,String thoiGianBaoHanh , int dienAp , float congSuat) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}
	HangHoa hh1 = new HangHoa(null, null, null, 0);
	public void Nhap() {
		hh1.Nhap();
		System.out.println("🕐 Nhập Thời Gian Bảo Hành : ");
		thoiGianBaoHanh = sc.nextLine();
		System.out.println("⚡Nhập điện áp : ");
		dienAp = sc.nextInt();
		System.out.println("🎛 Nhập công suất : ");
		congSuat = sc.nextFloat();
	}
	
	public String toString() {
		return "💻 Hàng Điện Máy ➡️ " +hh1.toString() +" || "+ "🕐 Thời Gian Bảo Hành : " + thoiGianBaoHanh + " || " + "⚡ Điện Áp : " + dienAp + " || " + "🎛 Công Suất " + congSuat;
	}
	
}
