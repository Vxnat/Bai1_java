import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cho mang");
		n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Nhap phan tu thu " + (i+1));
			A[i] = sc.nextInt();
		}
		System.out.print("Trước khi sắp xếp : " );
		for (int i = 0; i < A.length; i++) {
			System.out.print( " " + A[i]);
		}
		System.out.println();
		Arrays.sort(A);
		System.out.println("Sau khi sắp xếp : \n " + Arrays.toString(A));
		
		System.out.println("Sap xep nguoc lai :");
		for (int i = n - 1 ; i < n; i--) {
			if(i == -1)
				break;
			System.out.print(" " + A[i]);
		}
	}
}
