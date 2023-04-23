package Lab4_4;

public class Test {
	public static void main(String[] args) {
		
		HocVienDH hvdh1 = new HocVienDH(null, null, null, 0, 0, 0);
		System.out.println("---------------------");
		System.out.println("*** Học Viên Đồ Họa *** ");
		hvdh1.Nhap();
		System.out.println("---------------------");
		System.out.println("*** Kết quả *** ");
		hvdh1.In();
		
		HocVienLT hvlt1 = new HocVienLT(null, null, null, 0, 0, 0);
		System.out.println("---------------------");
		System.out.println("*** Học Viên Lập Trình *** ");
		hvlt1.Nhap();
		System.out.println("---------------------");
		System.out.println("*** Kết quả *** ");
		hvlt1.In();
		
		System.out.println();
		System.out.println("-------- OUT ----------");
	}
}
