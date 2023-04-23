package Lab4_5;

public class GVThinhGiang extends GiangVien {

	private int soTietDay;
	private double donGia;
	
	public GVThinhGiang(String hoTen, String diaChi, String loaiGiangVien , int soTietDay , double donGia ) {
		super(hoTen, diaChi, loaiGiangVien);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}
	

	@Override
	public void Nhap() {
			super.Nhap();
			System.out.println("Nhập Số Tiết Dạy: ");
			soTietDay = sc.nextInt();
			System.out.println("Nhập Đơn Giá: ");
			donGia = sc.nextDouble();
	}

	@Override
	public double tinhLuong() {
		return (soTietDay * donGia) - 0.15*(soTietDay * donGia);
	}

	@Override
	public void In() {
		super.In();
		System.out.println("Số Tiết Dạy: " + soTietDay);
		System.out.println("Đơn Giá: " + numd.format(donGia));
		
	}


	
}
