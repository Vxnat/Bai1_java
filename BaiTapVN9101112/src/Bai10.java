import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		String a;
		char b;
		int c=0;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Nhap 1 dong chu <=80 ki tu :");
			a = sc.nextLine();
		}while(a.length()>80) ;
			
		System.out.println("Nhap 1 ki tu de kiem tra so lan xuat hien ");
		b = sc.next().charAt(0);
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == b) {
				c++;
			}
		}
		System.out.println(c);
		
	}
}
