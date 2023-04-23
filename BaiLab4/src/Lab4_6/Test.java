package Lab4_6;

public class Test {
	public static void main(String[] args) {
		
		CNKSP Cnksp1 = new CNKSP(null, null, null, 0, 0);
		System.out.println("----------------");
		System.out.println("*** Công Nhân Khoán Sản Phẩm *** ");
		Cnksp1.Nhap();
		System.out.println("---------------------");
		System.out.println("*** Kết quả *** ");
		Cnksp1.In();

		CNTCN Cntcn1 = new CNTCN(null, null, null, 0, 0, 0);
		System.out.println("----------------");
		System.out.println("*** Công Nhân Tính Công Nhật *** ");
		Cntcn1.Nhap();
		System.out.println("---------------------");
		System.out.println("*** Kết quả *** ");
		Cntcn1.In();
		
		System.out.println();
		System.out.println("-------- OUT ----------");
	}
}
