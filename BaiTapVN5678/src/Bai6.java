import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap n");
		n = sc.nextInt();
		int giaithua = 1;
		for (int i = n; i > 0; i--) {
			giaithua *=i;
			
		}
		System.out.println(giaithua);
}
}
