package Bai3_2;

import java.util.Scanner;

public class DIEM {
	protected int x,y;
	
	public void NHAPDIEM() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập x: ");
		x = sc.nextInt();
		System.out.println("Nhập y: ");
		y = sc.nextInt();
	}
	
	DIEM(int x , int y){
		
	}
	
	public void INDIEM() {
		System.out.printf("Tọa Độ (%d,%d)",x,y);
	}
	

}
