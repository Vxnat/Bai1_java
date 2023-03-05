import java.util.Iterator;
import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		int kiTuSo=0;
		int kiTuThuong=0;
		int kiTuHoa=0;
		System.out.println("Nhap 1 dong chu :");
		a = sc.nextLine();
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) >=48 && a.charAt(i) <=57) {
				kiTuSo++;
			}
			if(a.charAt(i) >=65 && a.charAt(i) <=90) {
				kiTuHoa++;
			}
			if(a.charAt(i) >=97 && a.charAt(i) <=122) {
				kiTuThuong++;
			}
				
		}
		
		System.out.println(kiTuSo);
		System.out.println(kiTuHoa);
		System.out.println(kiTuThuong);
	}
}
