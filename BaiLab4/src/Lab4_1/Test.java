package Lab4_1;

public class Test {
	public static void main(String[] args) {
		BenhVien bv1 = new BenhVien("Hà Nội", "Hà Nội", "Nguyễn Văn A");
		BenhNhan bn1 = new BenhNhan("Nguyễn Văn B", 19, '♂',"Bệnh Tim", "Suy Tim", bv1);
		
		
		System.out.println(bn1.toString());
		
	}
}
