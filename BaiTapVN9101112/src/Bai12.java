import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong :");
		x = sc.nextInt();
		System.out.println("Nhap so cot :");
		y = sc.nextInt();
		int a[][] = new int[x][y];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Nhap phan tu thu " + (i+1) + " " + (j+1) );
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Ma tran vua nhap : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i][j] > max)
					max = a[i][j];
			}
		}
		System.out.println("Phan tu lon nhat trong ma tran : " + max);
		
		
	}
}
