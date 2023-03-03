import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int n;
		String ten;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ten cua ban : ");
		ten = sc.nextLine();
		
		System.out.println("Nhap tuoi : ");
		n = sc.nextInt();
		
		if(n<16) {
			System.out.println(ten + " dang o tuoi vi thanh nien");
		}else {
			if(n>=16 && n < 18)System.out.println(ten + " dang o tuoi truong thanh");
			
			else if(n>=18)System.out.println(ten + " da gia");
		}
			
}
}
