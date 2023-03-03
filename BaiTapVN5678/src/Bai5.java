import java.util.Iterator;
import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("Ban muon nhap bao nhieu so :");
		a = sc.nextInt();
		System.out.println();
		int n[] = new int[a];
		for (int i = 0; i < n.length; i++) {
			
			System.out.println("So thu " + (i+1));
			n[i] = sc.nextInt();
		}
		int tong = 0;
		for (int i = 0; i < n.length; i++) {
			if(tong < 100)
				tong += n[i];
			else break;
		}
		System.out.println(tong);
		
		
		
	}
}
