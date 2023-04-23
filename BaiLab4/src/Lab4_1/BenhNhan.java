package Lab4_1;

public class BenhNhan extends Nguoi {

	private String tienSu,chanDoan;
	private BenhVien benhVien;
	

	public BenhNhan(String ten, int tuoi, char gioiTinh , String tienSu , String chuanDoan , BenhVien benhVien) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chanDoan = chuanDoan;
		this.benhVien = benhVien;
	}


	public String getTienSu() {
		return tienSu;
	}


	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}


	public String getChanDoan() {
		return chanDoan;
	}


	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}


	public BenhVien getBenhVien() {
		return benhVien;
	}


	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	
	public String toString() {
		return super.toString() + " || " + "Tiềnsử: " + tienSu +" || "+ "ChẩnĐoán: " + chanDoan +" || "+ "BệnhViện: " + benhVien;
	}
}
