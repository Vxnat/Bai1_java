package Lab4_1;

public class BenhVien {
	private String ten , diaChi , giamDoc;

	public BenhVien(String ten, String diaChi, String giamDoc) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
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

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	
	public String toString() {
		return ten + " || " + "ĐịaChỉ: " + diaChi + " || " + "GiámĐốc: " + giamDoc;
	}
	
	
	
	
}
