package Lab4_2;

public class Truong {
	private String ten, diaChi ,hieuTruong;

	public Truong(String ten, String diaChi, String hieuTruong) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHieuTruong() {
		return hieuTruong;
	}

	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	
	public String toString() {
		return ten +" || "+ "ĐịaChỉ: " + diaChi +" || "+ "HiệuTrưởng: " + hieuTruong;
	}
	
}
