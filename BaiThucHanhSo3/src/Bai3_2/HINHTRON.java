package Bai3_2;

import java.util.Scanner;

public class HINHTRON extends DIEM {
	
	HINHTRON(int x, int y) {
		super(x, y);
	}

	private double r;
	DIEM A = new DIEM(x, y);
	public void NhapDT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Bán Kính : ");
		r = sc.nextDouble();
		System.out.println("Nhập tọa độ tâm : ");
		A.NHAPDIEM();
	}
	
	public void InDT() {
		System.out.println("Bán kính: " + r);
		System.out.println("----");
		System.out.print("Tọa độ Tâm 💪 ");
		A.INDIEM();
	}
	public double Chuvi() {
		return 2 * Math.PI * r;
	}
	
	public double DienTich() {
		return Math.PI * Math.pow(r, 2);
	}
}
