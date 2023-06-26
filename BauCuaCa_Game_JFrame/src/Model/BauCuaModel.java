package Model;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class BauCuaModel {
	private int taiKhoanNguoiChoi = 100000000;
	public ArrayList<String> listXucXacChon = new ArrayList<String>();
	private Random r1 = new Random();
	
	// Giá Trị Xúc Xắc
	protected static final String[] ketQua = {"BẦU", "CUA", "TÔM", 
			  "CÁ", "GÀ", "NAI"};
	
	// Random
	int giaTri1 ;
	int giaTri2 ;
	int giaTri3 ;
	    
	// KetQua Tung Xuc Xac
	String ketQua1 ;
	String ketQua2 ;
	String ketQua3 ;
	
	public BauCuaModel() {
		
	}
	public BauCuaModel(int tienCuoc) {
		this.taiKhoanNguoiChoi = tienCuoc;
	}

	public int getTienCuoc() {
		return taiKhoanNguoiChoi;
	}
	public void setTienCuoc(int tienCuoc) {
		this.taiKhoanNguoiChoi = tienCuoc;
	}
	public String toString() {
		return "TienCuoc [tienCuoc=" + taiKhoanNguoiChoi + "]";
	}
	
	public void truTien(int tienCuoc) {
		this.taiKhoanNguoiChoi -= tienCuoc;
	}
	
	public String ketquaXucXac1() {
		giaTri1 = r1.nextInt(ketQua.length-1);
		ketQua1 = ketQua[giaTri1];
		return ketQua1;
	}
	public String ketquaXucXac2() {
		giaTri2 = r1.nextInt(ketQua.length-1);
		ketQua2 = ketQua[giaTri2];
		return ketQua2;
	}
	public String ketquaXucXac3() {
		giaTri3 = r1.nextInt(ketQua.length-1);
		ketQua3 = ketQua[giaTri3];
		return ketQua3;
	}
	
	public void xucXacChon(String xucXacChon) {
		this.listXucXacChon.add(xucXacChon);
	}
	public void xucXacChonDelete() {
		this.listXucXacChon.clear();
	}
	public void congTien(int soTien) {
		this.taiKhoanNguoiChoi += soTien * 2;
	}
	public void congTienKhiLamMoi(int soTien) {
		this.taiKhoanNguoiChoi += soTien;
	}

}
