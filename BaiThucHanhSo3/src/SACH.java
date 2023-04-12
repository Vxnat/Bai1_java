import java.util.Scanner;

public class SACH {
	private String ma , ten ,tg , loai , nxb;
	private int trang , tap , gia;
	
	
	public SACH(String ma, String ten, String tg, String loai, String nxb, int trang, int tap, int gia) {
		this.ma = ma;
		this.ten = ten;
		this.tg = tg;
		this.loai = loai;
		this.nxb = nxb;
		this.trang = trang;
		this.tap = tap;
		this.gia = gia;
	}

	public void NHAPSACH() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sach : ");
		ma = sc.nextLine();
		System.out.println("Nhap ten sach: ");
		ten = sc.nextLine();
		System.out.println("Nhap ten tac gia: ");
		tg = sc.nextLine();
		System.out.println("Nhap loai sach: ");
		loai = sc.nextLine();
		System.out.println("Nhap ten nxb: ");
		nxb = sc.nextLine();
		System.out.println("Nhap trang: ");
		trang = sc.nextInt();
		System.out.println("Nhap tap: ");
		tap = sc.nextInt();
		System.out.println("Nhap gia: ");
		gia = sc.nextInt();
	}
	
	public void INSACH() {
		System.out.printf("MaSach: %s || TenSach : %s || TenTacGia: %s || LoaiSach: %s || NXB: %s || Trang: %d || Tap: %d || Gia: %d ",ma ,ten , tg ,loai ,nxb ,trang , tap , gia);
	}
}
