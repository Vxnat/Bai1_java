import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 so nguyen : ");
		n = sc.nextInt();
		
		if(n%2==0)System.out.println("So chan");
		else System.out.println("So le");
	}
}
