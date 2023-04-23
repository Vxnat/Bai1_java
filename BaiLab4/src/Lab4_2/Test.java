package Lab4_2;

public class Test {
	public static void main(String[] args) {
		
		Truong t1 = new Truong("Di Trạch", "Hà Nội", "Nguyễn Văn A");
		SinhVien sv1 = new SinhVien("Nguyễn Văn B ", 19, '♂', "DCCTCT66F2", "CNTT", t1);
		
		System.out.println(sv1.toString());
	}
}
