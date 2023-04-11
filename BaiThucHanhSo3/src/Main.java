import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SACH sach1 = new SACH();
		
		sach1.NHAPSACH();
		sach1.INSACH();
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println();
		System.out.println("Nhập số đầu sách: ");
		 n = sc.nextInt();
		SACH sach2[] = new SACH[n];
		for (int i = 0; i < n; i++) {
			sach2[i].NHAPSACH();
		}
		for (int i = 0; i < n; i++) {
			sach2[i].INSACH();
		}
	}
}
