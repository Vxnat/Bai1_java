import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SACH sach1 = new SACH(null, null, null, null, null, 0, 0, 0);
		
		sach1.NHAPSACH();
		sach1.INSACH();
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println();
		System.out.println("***Nhập số đầu sách: ");
		 n = sc.nextInt();
		SACH sach2[] = new SACH[n];
		for (int i = 0; i < n; i++) {
			System.out.println("***Đầu sách " + (i+1));
			sach2[i] = new SACH(null, null, null, null, null, n, n, i);
			sach2[i].NHAPSACH();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("***Đầu sách " + (i+1) + " vừa nhập : ");
			sach2[i].INSACH();
			System.out.println();
		}
	}
}
