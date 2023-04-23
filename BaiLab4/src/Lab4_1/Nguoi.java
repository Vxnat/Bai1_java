package Lab4_1;

public class Nguoi {
	protected String ten;
	protected int tuoi;
	protected char gioiTinh;
	

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	
	public Nguoi() {
		
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGioitinh() {
		return gioiTinh;
	}

	public void setGioitinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public String toString() {
		return "Tên: " + ten + "||" + "Tuổi: " + tuoi + "||" + "GiớiTính: " +gioiTinh; 
	}
	
	
}
