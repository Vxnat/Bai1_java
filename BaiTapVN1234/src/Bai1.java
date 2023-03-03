import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a : ");
		a = sc.nextInt();
		System.out.println("Nhap b:");
		b = sc.nextInt();
		
		System.out.println("Tong " + a + " va " + b + " = " +(a+b));
		System.out.println("Hieu " + a + " va " + b + " = " +(a-b));
		System.out.println("Tich " + a + " va " + b + " = " +(a*b));
		System.out.println("Thuong " + a + " va " + b + " = " +(a/b));
		System.out.println("Chia lay du " + a + " va " + b + " = " +(a%b));
		
		if(a>b)System.out.println(a +" > " + b);
		if(a<b)System.out.println(a + " < " + b );
		if(a==b)System.out.println(a + " = " + b);
		
		
		
	}
}
