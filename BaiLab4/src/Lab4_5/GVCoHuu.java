package Lab4_5;

public class GVCoHuu extends GiangVien{

	private double luongCoBan;
	private float heSoLuong;
	private int thamNien;
	
	public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien , float heSoLuong , double luongCoBan ,int thamNien ) {
		super(hoTen, diaChi, loaiGiangVien);
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
		this.thamNien = thamNien;
	}
	

	@Override
	public void Nhap() {
			super.Nhap();
			System.out.println("Nhập Lương Cơ Bản: ");
			luongCoBan = sc.nextDouble();
			System.out.println("Nhập Hệ Số Lương: ");
			heSoLuong = sc.nextFloat();
			System.out.println("Nhập Thâm Niên: ");
			thamNien = sc.nextInt();
	}

	@Override
	public double tinhLuong() {
		
		if(thamNien >= 5) {
			double phuCap = ((double)thamNien / 100) * luongCoBan;
			return (luongCoBan*heSoLuong) +  phuCap;
		}
		else if(thamNien <5) return luongCoBan*heSoLuong;
		
		else return 0;
	}


	@Override
	public void In() {
		super.In();
		System.out.println("Thâm Niên: " + thamNien);
		System.out.println("Lương Cơ Bản " + numd.format(luongCoBan));
		
	}
}
