package Lab4_6;

public class CNKSP extends CongNhan {
	
	private int soSanPham ;
	private float donGiaSanPham;
	
	public CNKSP(String hoTen, String diaChi, String ngaySinh , int soSanPham , float donGiaSanPham) {
		super(hoTen, diaChi, ngaySinh);
		this.soSanPham = soSanPham;
		this.donGiaSanPham = donGiaSanPham;
	}
	
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập Số Sản Phẩm: ");
		soSanPham =sc.nextInt();
		System.out.println("Nhập Đơn Giá Sản Phẩm: ");
		donGiaSanPham =sc.nextFloat();
	}

	@Override
	public double tinhLuong() {
		int mucQuyDinh = 1000;
		if(soSanPham - mucQuyDinh >= 100 && soSanPham - mucQuyDinh < 150) {
			return (soSanPham * donGiaSanPham) + 1000000;
		}
		else if(soSanPham - mucQuyDinh >= 150) {
			return (soSanPham * donGiaSanPham) + 1500000;
		} 
		else return (soSanPham * donGiaSanPham);
	}
	
	public void In() {
		super.In();
		System.out.println("*** Số Sản Phẩm: " + soSanPham);
		System.out.println("*** Đơn Giá Sản Phẩm: " + numd.format(donGiaSanPham));
	}
	
	
}
