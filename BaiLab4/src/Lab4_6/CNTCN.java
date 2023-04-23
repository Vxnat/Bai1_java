package Lab4_6;

public class CNTCN extends CongNhan {
	
	private float luongCoBan , heSoLuong;
	private int soNgayCong;
	
	public CNTCN(String hoTen, String diaChi, String ngaySinh , float luongCoBan , float heSoLuong, int soNgayCong) {
		super(hoTen, diaChi, ngaySinh);
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}
	
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập Lương Cơ Bản: ");
		luongCoBan = sc.nextFloat();
		System.out.println("Nhập Hệ Số Lương: ");
		heSoLuong = sc.nextFloat();
		System.out.println("Nhập Số Ngày Công: ");
		soNgayCong = sc.nextInt();
	}

	@Override
	public double tinhLuong() {
		if(soNgayCong>=20 && soNgayCong <=31) {
			return (luongCoBan * heSoLuong) + (1.2 * luongCoBan);
		}
		else return luongCoBan * heSoLuong;
	}
	
	public void In() {
		super.In();
		System.out.println("*** Lương Cơ Bản: " + numd.format(luongCoBan));
		System.out.println("*** Hệ Số Lương: " + heSoLuong);
		System.out.println("*** Số Ngày Công: " + soNgayCong);
	}
	
	
	
	

}
