import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Ban muon nhap bn so : ");
		 n = sc.nextInt();
		int a[] = new int[n];
		int tbc = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so thu " + (i+1));
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			tbc +=a[i];
		}
		
		System.out.println("TBC : " + (tbc/n));
		
	
	}
}
