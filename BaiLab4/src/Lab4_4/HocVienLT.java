package Lab4_4;

import java.text.NumberFormat;
import java.util.Locale;

public class HocVienLT extends HocVien {

	private int soBuoi ;
	private float donGia;

	public HocVienLT(String hoTen, String diaChi, String loaiChuongTrinhDangKy, int loaiUuTien , int soBuoi , float donGia) {
		super(hoTen, diaChi, loaiChuongTrinhDangKy, loaiUuTien);
		this.soBuoi = soBuoi;
		this.donGia = donGia;
	}
	
	Locale lc = new Locale("vi","VN");
	NumberFormat numd = NumberFormat.getCurrencyInstance(lc);//Đơn vị tiền tệ hiện tại
	 
	
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập Số Buổi: ");
		soBuoi = sc.nextInt();
		System.out.println("Nhập Đơn Giá : ");
		donGia = sc.nextFloat();
		
	}

	@Override
	public float hocPhi() {
		if(loaiUuTien==1) {
			return (soBuoi*donGia) - 1000000;
		}
		else if(loaiUuTien==2) {
			return (soBuoi*donGia) - 800000;
		}
		else return soBuoi*donGia;
	}

	@Override
	public void In() {
		super.In();
		System.out.println("*** Số Buổi: " + soBuoi);
		System.out.println("*** Đơn Giá : " + numd.format(donGia));
	}

}
